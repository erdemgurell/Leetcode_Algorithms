package LeetCode;

public class SearchIntsertPosition {

    public static void main(String[] args) {
        int[] searchInts = {1, 3, 5, 6};
        int target = 5;

        searchInsert(searchInts, target);
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        int middle = nums.length / 2;
        System.out.println("middle = " + middle);
        int[] searchArr = new int[middle];

        if (target < middle) {
            for (int i = 0; i < middle; i++) {
                searchArr[i] = nums[i];
            }

        } else if (target > middle) {
            for (int i = middle; i < nums.length; i++) {
                searchArr[i] = nums[i];
            }

        }


        return index;
    }
}
