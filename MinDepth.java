/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
 * Be aware of the situation that one or both child(ren) is 0. It is more complicated than max depth.
*/
public class Solution {
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return 0;

        int left = minDepth(root.left);
          
        int right = minDepth(root.right);
        
        if(left == 0 || right == 0)
        {
            return ((left < right) ? right : left) + 1;
        }

        return ((left < right) ? left : right ) + 1;
    }
}
