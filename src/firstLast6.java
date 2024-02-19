public class firstLast6 {
    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] = 1;
        a[4] = 6;
        a[8] = 6;
        System.out.println(firstLast6(a));
    }

    public static boolean firstLast6(int[] nums) {
        return ((nums[0]==6) || (nums[nums.length-1]==6));
    }
}
