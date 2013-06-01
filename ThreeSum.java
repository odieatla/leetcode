/*
    Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

    Note:

    Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ? b ? c)
    The solution set must not contain duplicate triplets.

    * O(n2)
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
        
        if(num.length < 3) return all;
        
        Arrays.sort(num);
        
        for(int i = 0; i < num.length; i++)
        {
            if(i == 0 || num[i] > num[i-1])
            {
              int j = i + 1;
              int k = num.length - 1;
              int  val = 0 - num[i];
          
              while(j < k)
              {
                if(num[j] + num[k] == val)
                {
                  ArrayList<Integer> al = new ArrayList<Integer>();
                  al.add(num[i]);
                  al.add(num[j]);
                  al.add(num[k]);
                  all.add(al);
                  j++;
                  k--;
                  while(j < k && num[j] == num[j-1]) j++;
                  while(j < k && num[k] == num[k+1]) k--;
                }
                else if(num[j] + num[k] > val)
                {
                  k--;
                }
                else
                {
                  j++;
                }
              }
            }
          }
        
          return all;
    }
}
