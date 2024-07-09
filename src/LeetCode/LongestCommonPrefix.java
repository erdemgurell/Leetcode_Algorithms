package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] stringArray = {"flower","flow","floght"};

        System.out.println(prefix(stringArray));

    }

    public static String prefix(String[] strs) {
        String prefix = "";
        int count = 0;
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].length() < strs[i + 1].length()) {
                prefix = strs[i];
            } else {
                prefix = strs[i + 1];
            }
        }

        return findPrefix(strs, prefix, count);

//        int new_length = prefix.length();
//        int count = 0;
//        while (new_length >= 0) {
//            count = 0;
//            for (int i = 0; i < strs.length; i++) {
//                if (strs[i].startsWith(prefix)) {
//                    count++;
//                } else {
//                    prefix = prefix.substring(0, new_length--);
//                    break;
//                }
//            }
//            if (count == strs.length) {
//                break;
//            }
//        }
//        if (count == strs.length) {
//            return prefix;
//        } else return "";

    }

    public static String findPrefix(String[] strs, String prefix, int count) {
        if (prefix.length() < 0) {
            return "";
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].startsWith(prefix)) {
                count++;
                if (count == strs.length) {
                    return prefix;
                }
            } else {
                count = 0;
                prefix = findPrefix(strs, prefix.substring(0, prefix.length() - 1), count);
            }
        }

        return prefix;
    }

}
