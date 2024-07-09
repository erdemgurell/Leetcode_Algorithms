package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<String, Integer> roman = new HashMap<String, Integer>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};

        String s = "MCMXCIV";
        String[] splitted = s.split("");
        int result = 0;
        int length = splitted.length;

        for (int i = 0; i < length; i++) {

            if (i < length - 1 && roman.get(splitted[i]) < roman.get(splitted[i + 1])) {
                result -= roman.get(splitted[i]);
            }
            else {
                result += roman.get(splitted[i]);
            }
        }
        System.out.println("result = " + result);

    }
}
