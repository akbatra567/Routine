
import java.util.Arrays; 
import java.util.HashMap;

class Solution {
      public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for( int i = 0; i < nums.length; i++ )
        {
            int num = nums[i];
            int complement = target - num;
            if(map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }

            map.put(num, i);
        }
        return new int[]{};
    }

    public static void main(String[] args)
    {
        Solution sol = new Solution();
        int[] nums = new int[]{2,7,11,15};
        int[] result = sol.twoSum(nums, 9);   
    }
}