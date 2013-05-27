/*
    Given an array of integers, find two numbers such that they add up to a specific target number.

    The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

    You may assume that each input would have exactly one solution.

    Input: numbers={2, 7, 11, 15}, target=9
    Output: index1=1, index2=2

    *Input not sorted
*/
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
