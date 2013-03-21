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
    private int getMaxTree(TreeNode root)
    {
        if(root == null) return 0;

        return Math.max(getMaxTree(root.left), getMaxTree(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root)
    {
        if(root == null) return true;

        if(Math.abs(getMaxTree(root.left) - getMaxTree(root.right)) > 1) return false;

        return (isBalanced(root.left) && isBalanced(root.right)) ;
    }
}
