public class Solution {
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
}
