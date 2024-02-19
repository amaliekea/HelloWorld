public class countEvents {
    public static void main(String[] args) {
    }

    public static int countEvens(int[] nums) {
        int neven = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                neven++;
            }
        }
        return neven;
    }
}