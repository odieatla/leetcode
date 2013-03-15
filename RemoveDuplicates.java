public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length == 0) return 0;

        int before = 0;
        int after = 1;

        //int elem = null; can't assign int to null

        while(after < A.length)
        {
          if(A[after] != A[before])
          {
            before++;
            A[before] = A[after];
          }

          after ++;
        }

        return before + 1;
    }
}
