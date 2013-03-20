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
  public boolean hasPathSum(TreeNode root, int sum) {
    if(root == null) return false;

    return pathSum(root, sum, 0);
  }

  private boolean pathSum(TreeNode root, int sum, int result)
  {
    result += root.val;

    if(result == sum && root.left == null && root.right == null)
      return true;

    boolean l_r = false;
    boolean r_r = false;

    if(root.left != null)
      l_r = pathSum(root.left, sum, result);

    if(root.right != null)
      r_r = pathSum(root.right, sum, result);

    return l_r || r_r;
  }
}

