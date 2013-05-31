/*
    Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

    Follow up:
    Did you use extra space?
    A straight forward solution using O(mn) space is probably a bad idea.
    A simple improvement uses O(m + n) space, but still not the best solution.
    Could you devise a constant space solution?
*/
public class Solution {


    //Space O(m+n), followed by better solution
    public void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        
        for(int i = 0 ; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    cols[j] = true;
                    rows[i] = true;
                }
            }
        }
        
        for(int i = 0; i < matrix.length ; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(cols[j] || rows[i])
                {
                    matrix[i][j] = 0;
                }
            }
        }
        
        return;
    }

    //constant space
    public void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        boolean row0 = false;
        boolean col0 = false;
        
        //if any of first row is 0, then first row except (0,0) all to 0.
        for(int i = 0; i < matrix[0].length; i++)
        {
            if(matrix[0][i] == 0)
            {
                row0 = true;
            }
        }

        //if any of first col is 0, then first col except (0,0) all set to 0.
        for(int i = 0 ; i < matrix.length; i++)
        {
            if(matrix[i][0] == 0)
            {
                col0 = true;
            }
        }
        
        //if (i,j) == 0, then set (i,0) and (0,j) to 0.
        for(int i = 1; i < matrix.length; i++)
        {
            for(int j = 1; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        /*all the prepare is done, now start to set 0s.*/

        //if (0,i) is 0, then this col is all set to 0.
        for(int i = 1 ; i < matrix[0].length; i++)
        {
            if(matrix[0][i] == 0)
            {
                for(int j = 1; j < matrix.length; j++)
                {
                    matrix[j][i] = 0;
                }
            }
        }

        //if (i, 0) is 0, then this row is all set to 0.
        for(int i = 0; i < matrix.length; i++)
        {
            if(matrix[i][0] == 0)
            {
                for(int j = 1; j < matrix[0].length; j++)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        //the bottom right part is taken care of, start to take care of the first row and first col.
        //special case (0,0) -- if 0, then first row and first col is all 0.
        if(matrix[0][0] == 0)
        {
            for(int i = 1; i < matrix[0].length; i++)
            {
                matrix[0][i] = 0;
            }
            
            for(int i = 1; i < matrix.length; i++)
            {
                matrix[i][0] = 0;
            }
        }
        //if (0,0) not 0, then if row0 == 0, first row 0; if col0 == 0, first col 0.
        else
        {
            if(row0)
            {
                for(int i = 0; i < matrix[0].length; i++)
                {
                    matrix[0][i] = 0;
                }
            }
            if(col0)
            {
                for(int i = 0; i < matrix.length; i++)
                {
                    matrix[i][0] = 0;
                }
            }
        }

    } //end of 2nd method
}
