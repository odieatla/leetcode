public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArraySet<Character> box_result = new ArraySet<Character>();
        ArraySet<Character> row = new ArraySet<Character>();
        ArraySet<Character> column = new ArraySet<Character>();
        
        for(int c = 0; c < 9; c++)
        {
            for(int r = 0; r < 9; r++)
          {
            char item = board[r][c];
            
            if(item == '.')
            {
              continue;
            }
          
            if(r%3 == 0 && c%3 == 0)
          {
      
          for(int i = c; i - c < 3; i++)
          {
            for(int j = r; j - r < 3; j++)
            {
              if(box_result.contains(board[j][i]))
              {
                return false;
              }
              else
              {
                box_result.add(board[j][i]);
              }
            }
          }
        }

        if(row.contains(item))
        {
          return false;
        }
        else
        {
          row.add(item);
        }
        
        if(column.contains(item))
        {
          return false;
        }
        else
        {
          column.add(item);
        }
        
        return true;
          }
        }
    }
}
