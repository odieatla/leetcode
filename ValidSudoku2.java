public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int N = board.length;
        
        int[] row = new int[N];
        int[] col = new int[N];
        int[] cube = new int[N];
        
        for(int r = 0; r < 9; r++)
        {
            for(int c = 0; c < 9; c++)
            {
            int b = (c / 3) + 3* (r/3);
          
            char item = board[r][c];
            if(item != '.')
            {
              int num = item - '1';
              
              if((row[r] & (1 << num)) > 0)
              {
                return false;
              }
              else
              {
                row[r] |= (1 << num);
              }
              
              if((col[c] & (1 << num)) > 0)
              {
                return false;
              }
              else
              {
                col[c] |= (1 << num);
              }
              
              if((cube[b] & (1 << num)) > 0)
              {
                return false;
              }
              else
              {
                cube[b] |= (1 << num);
              }
            }
          }
        }
        
        return true;
    }
}
