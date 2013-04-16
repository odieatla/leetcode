public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        return climbStairsDp(0, new int[n+2], n);
    }
    
    private int climbStairsDp(int step, int[] cache, int n)
    {
      if(step == n)
      {
        return 1;
      }
      if(step > n)
      {
        return 0;
      }
      
      int step_plus_1, step_plus_2;
      
      if(cache[step + 1] == 0)
      {
        cache[step+1] = climbStairsDp(step+1, cache, n);
      }

      step_plus_1 = cache[step + 1];
      
      if(cache[step + 2] == 0)
      {
        cache[step+2] = climbStairsDp(step+2, cache, n);
      }
      step_plus_2 = cache[step + 2];
      
      cache[step] = step_plus_1 + step_plus_2;
      
      return cache[step];
    }
}
