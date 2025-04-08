package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_1TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] index = twoSum(nums, 9);
        System.out.println(Arrays.toString(index));
        System.out.println("First Number:" + nums[index[0]] + " Second Number:" + nums[index[1]]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found
        return new int[]{};
    }
}
