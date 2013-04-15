public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int al = a.length();
        int bl = b.length();
        
        int minlen = (al > bl) ? bl : al;
      String c = (al > bl) ? a : b;
    int cl = c.length();

        int carry = 0;
        
        String out = "";
        
        for(int i = 0; i < minlen; i++)
        {
          int aa = a.charAt(al - 1 - i) - '0';
          int bb = b.charAt(bl - 1 - i) - '0';
          
          int rr = aa + bb + carry;
          
          if(rr > 1)
          {
            carry = 1;
            
            if(rr == 2)
            {
              out = "0" + out;
            }
            else
            {
              out = "1" + out;
            }
          }
          else
          {
            carry = 0;
            
            out = Integer.toString(rr) + out;
          }
        }
        
        for(int i = minlen; i < cl; i++)
        {
          int cc = c.charAt(cl - 1 - i) - '0';
          
          if(cc + carry > 1)
          {
            carry = 1;
            out = "0" + out;
          }
          else
          {
            out = Integer.toString(cc + carry) + out;
                carry = 0;
          }
        }
        
        if(carry == 1)
        {
            out = "1" + out;
        }
        
        return out;
    }
}
