package LeetCode;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        climbWays(n);

    }

    private static void climbWays(int n) {
        int one = 1, two = 1;
        int temp;
        if (n <= 2) {
            System.out.println(1);
        } else {
            for (int i = 0; i < n - 1; i++) {
                temp = one;
                one = one + two;
                two = temp;
            }
            System.out.println(one);
        }
    }
}
