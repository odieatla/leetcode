/*DP with memoization, passed both judge small and large.*/
public class Solution {

    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[][] route = new int[m+1][n+1];
        
        for(int i = 0; i < m+1; i++)
        {
            for(int j = 0; j < n+1; j++)
            {
                route[i][j] = -1;
            }
        }
        
        return goPath(0,0,m,n,route);
        
    }
    
    private int goPath(int row, int col, int m, int n, int[][] route)
    {
      if(row == m - 1 && col == n - 1)
      {
        return 1;
      }
      
        if(row >= m || col >= n)
        {
            return 0;
        }
        
        if(route[row][col+1] == -1)
        {
            route[row][col+1] = goPath(row, col+1, m, n, route);
        }
        
        if(route[row+1][col] == -1)
        {
            route[row+1][col] = goPath(row+1, col, m, n, route);
        }
        
      return route[row][col+1] + route[row+1][col];   
    }
    
}
