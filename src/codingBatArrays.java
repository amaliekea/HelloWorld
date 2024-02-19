public class codingBatArrays {
    public static void main(String[] args) {
        int[] a = {0, 1, 2};
        System.out.println(has22(a));
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}