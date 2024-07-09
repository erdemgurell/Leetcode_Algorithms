package LeetCode;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDupFromSortedList {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));


    }

    public static int removeDuplicates(int[] nums)
    {
        int i=0;
        for(int n:nums)
        {
            if(i<2 || n!=nums[i-2])
            {
                nums[i++]=n;
            }
        }
        return i;

    }


//        int[] nums = {1,2,2,3,3,4,6};
//
//        int j = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i-1]){
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//
//        System.out.println(j);
//    }


}
