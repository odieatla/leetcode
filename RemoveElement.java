class Solution {
  public int removeElement(int[] A, int elem)
  {
    int before = 0;
    int after = 0;
    
    if(A.length == 0) return 0;
    
    while(after < A.length)
    {
      if(A[after] != elem)
      {
        A[before] = A[after];
        before++;
      }
      
      after++;
    }
    
    return before;
  }
}
