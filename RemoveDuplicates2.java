/*
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array A = [1,1,1,2,2,3],

Your function should return length = 5, and A is now [1,1,2,2,3].
*/

public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length == 0 || A.length == 1)
        {
          return A.length;
        }
        
        //A.length > 1
        int count = 1;
        int j = 1;
        for(int i = 1; i < A.length; i++)
        {
          if(A[i] == A[i - 1])
          {
            if(count < 2)
            {
              A[j] = A[i];
              j++;
            }
            count++;
          }
          else
          {
            A[j] = A[i];
            count = 1;
            j++;
          }
        }
        
        return j;
    }
}
