import java.util.Scanner;

public class ts {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Mink");
        // System.out.print("Enter your size: ");
        // int size = sc.nextInt();

        // int[] array = new int[size];
        int[] nums = { 2, 7, 11, 5 };
        int target = 9;
        // System.out.print(twoSum(nums, target));
        int[] result = twoSum(nums, target);
        // System.out.print(result);

        for (int a : result) {
            System.out.print(a + " ");
        }
        // twoSum(nums, target);

        sc.close();

    }

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length; // จำนวนสมาชิกในอาร์เรย์

        for (int i = 0; i < n - 1; i++) { // วนลูปตั้งแต่ index 0 ถึง n-2
            for (int j = i + 1; j < n; j++) { // วนลูปตั้งแต่ index i+1 ถึง n-1
                if (nums[i] + nums[j] == target) { // เช็คว่าผลรวมของเลขสองตัวนี้เท่ากับ target หรือไม่
                    return new int[] { i, j }; // คืนค่า index ของเลขสองตัวนี้ในอาร์เรย์ใหม่
                }
            }
        }
        return new int[] {}; // หากไม่พบคู่ที่เป็น soluiton คืนค่าอาร์เรย์ว่าง
    }

}
