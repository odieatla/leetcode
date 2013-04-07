public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        hm.put('(', 1);
        hm.put('[', 2);
        hm.put('{', 3);
        hm.put(')', -1);
        hm.put(']', -2);
        hm.put('}', -3);

        Stack<Character> sk = new Stack<Character>();

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int out = hm.get(c);

            if(out < 0)
            {
                if((!sk.empty()) && (hm.get(sk.pop()) + hm.get(c) == 0))
                {
                    //do nothing;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                sk.push(c);
            }
        }

        if(sk.empty())
        {
            return true;
        }
        return false;

    }
}
