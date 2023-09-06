import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mink");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));

        String m = "flight";
        String target = "fl";
        int index = m.indexOf(target);
        System.out.println(index);

        sc.close();

    }

    public static boolean isPalindrome(int x) {

        // x not equal 0 or (first digit x not equal 0 and last digit not equal 0)
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int res = 0;
        while (x > res) {
            res = res * 10 + (x % 10);
            x = x / 10;
        }

        return (x == res || x == res / 10);
    }
}