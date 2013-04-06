public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs.length == 0)
        {
            return "";
        }
/*
        if(strs.length == 1)
        {
          return strs[0];
        }
*/         
        for(int i = 0; i < strs[0].length(); i++)
        {
          for(int j = 1; j < strs.length; j++)
          {
            if(i == strs[j].length()) //length check MUST be first. Otherwise may run time error.
            {
              return strs[0].substring(0, i);
            }
            
            if(strs[j].charAt(i) != strs[0].charAt(i))
            {
              return strs[0].substring(0, i);
            }
          }
        }
        
      return strs[0];
    }
}
