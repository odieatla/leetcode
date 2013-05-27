/*
    Longest Substring Without Repeating Characters

    Given a string, find the length of the longest substring without repeating characters.
    For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
    For "bbbbb" the longest substring is "b", with the length of 1.

    * Assume all character are lower case letters.

*/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start = 0;
        int out = 0;
        boolean[] visited = new boolean[26];
        
        for(int i = 0; i < s.length(); i++)
        {
          int c = s.charAt(i) - 'a';
            
          if(visited[c])
          {
            while(s.charAt(start) != s.charAt(i))
            {
              visited[s.charAt(start) - 'a'] = false;
              start++;
            }
            start++;
          }
          else
          {
            visited[c] = true;
          }
            if(i - start + 1 > out)
            {
              out = i - start + 1;
          }
        }
        return out;
    }
}
