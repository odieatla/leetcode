public class Solution {
    //O(n2)
    public int[] twoSum(int[] numbers, int target) {
        int[] out = new int[2];

        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[i] + numbers[j] == target)
                {
                    out[0] = i + 1;
                    out[1] = j + 1;
                    return out;
                }
            }
        }

        return out;
    }

    //average O(n), if O(1) for HashMap
    public int[] twoSum(int[] numbers, int target)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] out = new int[2];

        for(int i = 0 ; i < numbers.length; i++)
        {
            int n = numbers[i];
            if(hm.containsKey(target - n))
            {
                out[0] = hm.get(target-n);
                out[1] = i + 1;
                break;
            }
            hm.put(n, i+1);
        }
        return out;
    }
}
