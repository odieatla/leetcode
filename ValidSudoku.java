c class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashSet[] boxes = new HashSet[9];
        HashSet[] rows = new HashSet[9];
        HashSet[] columns = new HashSet[9];

        /*Initial for each object.*/
        for(int i = 0; i < boxes.length; i++)
        {
            boxes[i] = new HashSet();
        }

        for(int i = 0; i < rows.length; i++)
        {
          rows[i] = new HashSet();
        }

        for(int i = 0; i < columns.length; i++)
        {
          columns[i] = new HashSet();
        }
        
        for(int r = 0; r < 9; r++)
        {
            for(int c = 0; c < 9; c++)
            {
            char item = board[r][c];
            
            int b = (c / 3 ) + (3 * (r/3));
            
            if(item != '.')
            {
              continue;
            }
        
        if(boxes[b].contains(item))
        {
          return false;
        }
        else
        {
          boxes[b].add(item);
        }
        
        if(rows[r].contains(item))
        {
          return false;
        }
        else
        {
          rows[r].add(item);
        }

        if(columns[c].contains(item))
        {
          return false;
        }
        else
        {
          columns[c].add(item);
        }
          }
            
            
        }
        
        return true;
    }
}}
