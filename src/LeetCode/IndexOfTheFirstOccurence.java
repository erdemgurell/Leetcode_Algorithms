package LeetCode;

public class IndexOfTheFirstOccurence {
    public static void main(String[] args) {
        System.out.println("strStr =" + strStr("abc", "c"));
    }

    public static int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        String haystackPiece;
        char needleFirst = needle.charAt(0);

        if (haystackLen >= needleLen) {
            for (int i = 0; i < haystackLen; i++) {
                char hayNextFirst = haystack.charAt(i);

                if (i + needleLen <= haystackLen) {
                    if (hayNextFirst == needleFirst) {
                        haystackPiece = haystack.substring(i, i + needleLen);
                        if (haystackPiece.equals(needle)) {
                            return i;
                        }
                    }
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }


}
