package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3}; // 2,7,11,15 t = 9
        int target = 6;
        Map<Integer,Integer> stored = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (stored.containsKey(complement) && i != stored.get(complement)){
                System.out.println(Arrays.toString(new int[]{stored.get(complement), i})); ;
            }
            stored.put(nums[i],i);


        }
    }
}
