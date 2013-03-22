/*read left subtree and right subtree repectively, and compare the result, left = right.reverse, then is symmetric tree.*/

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return true;
        
        ArrayList<Integer> left = inOrder(root.left, new ArrayList<Integer>());
        ArrayList<Integer> right = inOrder(root.right, new ArrayList<Integer>());

    if(left.size() != right.size()) return false;
    
    for(int i = 0, j = 0; i < left.size(); i++)
    {
        if(left.get(i) != right.get(right.size() - 1 - i))
        {
            return false;
        }
        j--;
    }
    
    return true;
    }
    
    private ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> result)
    {
        if(root != null)
        {
            result = inOrder(root.left, result);
      
            result.add(root.val);
      
          result = inOrder(root.right, result);
        }
        return result;
    }
}
