/*read left subtree and right subtree in order repectively, and compare the result, left = right.reverse, then is symmetric tree.*/

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

/*
//another implementation, save recursive.

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        inOrder(root, list);
        
        if(list.size() == 0) return true;
        
        if(list.size()%2 == 0) return false;
        
        for(int i = 0; i < list.size()/2 ; i++)
        {
            if(list.get(i) != list.get(list.size() - 1 - i))
            {
                return false;
            }
        }
        
        return true;
        
    }
    
    private void inOrder(TreeNode root, ArrayList<Integer> list)
    {
        if(root == null) return;
        
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
*/
