import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] strs = { "flower", "flow", "flight" };

        System.out.println(countLongestCommonPrefix(strs));

        sc.close();

    }

    public static String countLongestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, strs.length - 1);
            }

        }
        return prefix;

    }
}