package LeetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2};

        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }


    public static int[] removeDuplicates(int[] nums) {
        TreeMap<Integer, Integer> non_dup = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            non_dup.put(nums[i], i);
            nums[i] = 0;
            nums[i] = non_dup.get(i);


        }


        return nums;
    }


}
