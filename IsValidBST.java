/*
    Given a binary tree, determine if it is a valid binary search tree (BST).

    Assume a BST is defined as follows:

    The left subtree of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.

*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//solution 1: compare node with the max from left and min from right.
public class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return true;
        
        return isValid(root, new int[2]);
    }
    
    private boolean isValid(TreeNode root, int[] min_max)
    {
        if(root.left == null && root.right == null)
        {
            min_max[0] = root.val;
            min_max[1] = root.val;
            return true;
        }
        
        boolean l = true;
        boolean r= true;
        int minf = root.val;
        int maxf = root.val;
        
        if(root.left != null)
        {
            l = (l && isValid(root.left, min_max));
            int max = min_max[1];
            minf = min_max[0];
            if(root.val > max )
            {
                l = (l && true);
            }
            else
            {
                l = (l && false);
            }
        }
        
        if(root.right != null)
        {
            r = (r && isValid(root.right, min_max));
            int min = min_max[0];
            maxf = min_max[1];
            if(root.val < min)
            {
                r = (r && true);
            }
            else
            {
                r = (r && false);
            }
        }

        min_max[0] = minf;
        min_max[1] = maxf;
   
        return (l && r);
    }   
}

/*
  solution 2: 3(left child) has to larger than 2 (node) and less than 5(passed from beginning.)

    5
  2   8
   3 6 9
*/
public class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isValid(TreeNode root, int min, int max)
    {
        if(root == null) return true;
        
        return (root.val > min) && (root.val < max) && (isValid(root.left, min, root.val)) && (isValid(root.right, root.val, max));
    }
    
}

//solution 3: in order traverse. because in order BST must be in increased order.
public class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] prev = new int[1];
        prev[0] = Integer.MIN_VALUE;
        return isValid(root, prev);
    }
    
    private boolean isValid(TreeNode root, int[] prev)
    {
        if(root == null) return true;
        
        if(isValid(root.left, prev))
        {
            if(root.val > prev[0])
            {
                prev[0] = root.val;
                
                return isValid(root.right, prev);
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
}
