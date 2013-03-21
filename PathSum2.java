/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private static ArrayList<ArrayList<Integer>> final_output = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final_output.clear();

        ArrayList<Integer> route = new ArrayList<Integer>();

        if(root != null) pathSum2(root, sum, 0, route);

        return final_output;
    }

    private void pathSum2(TreeNode root, int sum, int tmpsum, ArrayList<Integer> route) {
        tmpsum += root.val;
        route.add(root.val);

        if(sum == tmpsum && root.left == null && root.right == null)
        {
            final_output.add((ArrayList<Integer>)route.clone());
        }

        if(root.left != null)
        {
            pathSum2(root.left, sum, tmpsum, route);
        }
        if(root.right != null)
        {
            pathSum2(root.right, sum, tmpsum, route);
        }

        route.remove(route.size() - 1);
    }
}
