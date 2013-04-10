public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length == 0)
        {
            return 0;
        }
        
        return binarySearch(A, 0, A.length - 1, target);
    }
    
    private int binarySearch(int[] A, int start, int end, int target)
    {
      int mid = (start + end) / 2;
      
      int mid_v = A[mid];
      
      if(mid_v == target)
      {
        return mid;
      }
      
      if(start == end)
      {
        if(target > mid_v)
        {
          return mid + 1;
        }
        else
        {
          return mid;
        }
      }
      
      if(target > mid_v)
      {
        return binarySearch(A, mid+1, end, target);
      }
      else
      {
        return binarySearch(A, start, mid, target); //mid, not mid-1, since start could = mid, but end couldn't = mid
      }
    }
}
