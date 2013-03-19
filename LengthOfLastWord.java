public class Solution {
  public int lengthOfLastWord(String s) {
    // Start typing your Java solution below
    // DO NOT write main() function

    int len = s.length();
    int count = 0;

    if(len == 0) return 0;

    int start = -1;

    for(int i = len - 1; i > -1; i--)
    {
      if(s.charAt(i) != ' ')
      {
        start = i;
        break;
      }
    }

    if(start == -1) return 0;

    for(int i = start; i > -1; i--)
    {
      if(s.charAt(i) == ' ')
      {
        break;
      }

      count ++;
    }

    return count;

  }
}
