public class Solution {
    public int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return 0;

        int left = maxDepth(root.left);

        int right = maxDepth(root.right);

        return ((left > right) ? left : right ) + 1;
    }
}
