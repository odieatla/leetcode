/*
Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space to hold additional elements from B.
The number of elements initialized in A and B are m and n respectively.
*/

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int mm = m - 1;
        int nn = n - 1;
        
        for(int i = n + m - 1; i > -1 ; i--)
        {
          if(nn < 0 || mm < 0)
          {
            break;
          }
          
          if(A[mm] < B[nn])
          {
            A[i] = B[nn];
            nn--;
          }
          else
          {
            A[i] = A[mm];
            mm--;
          }
        }
        
        for(int j = nn; j > -1; j--)
        {
          A[j] = B[j];
        }
    }
}
