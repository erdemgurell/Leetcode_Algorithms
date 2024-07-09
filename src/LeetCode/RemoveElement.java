package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {4,5,4};
        int val = 4;
        System.out.println(removeElement(nums,val));

    }

    public static int removeElement(int[] nums, int val) {
        int k=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));
        return k;
    }

}

