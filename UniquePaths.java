/*Ony passes the judge small.*/
public class Solution {

    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        return goPath(0,0,m,n);
        
    }
    
    private int goPath(int row, int col, int m, int n)
    {
      if(row == m - 1 && col == n - 1)
      {
        return 1;
      }
      
        if(row >= m || col >= n)
        {
            return 0;
        }
        
      return goPath(row, col+1, m, n) + goPath(row+1, col, m, n);   
    }
}
