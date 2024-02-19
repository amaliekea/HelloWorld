public class lastDigit {
    public static void main(String[] args) {
        System.out.println(mod10(1011));
    }

    public static int mod10(int i) {
        int rest = i;
        while (rest > 10) {
            rest = rest - 10;
        }
        return rest;
    }
/*
    public static boolean lastDigit(int a, int b) {
        int resta = a % 10;
        int restb = b % 10;
        if (resta == restb) {
            return true;
        } else {
            return false;
        }
    }
 */
}
