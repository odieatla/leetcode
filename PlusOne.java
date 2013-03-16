public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int carry = 1;

        for(int i = digits.length - 1; i > -1; i--)
        {
          int d = digits[i];
          if(d + carry > 9)
          {
            digits[i] = 0;
          }
          else
          {
            digits[i] = d + carry;
            break;
          }
        }

        if(digits[0] == 0)
        {
          int[] output;
          output = new int[digits.length + 1];
          output[0] = 1;

          System.arraycopy(output, 1, digits, 0, digits.length);

          return output;
        }

        return digits;
    }
}
