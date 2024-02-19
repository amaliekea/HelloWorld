public class xyzThere {
    public static void main(String[] args) {
        String far = "ama.fxz";
        System.out.println(xyzThere(far));
    }

    public static boolean xyzThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i + 1).equals(".")) {
                i++;
            } else {
                String minStr = str.substring(i, i + 3);
                System.out.println(minStr);
                if (minStr.equals("xyz")) {
                    return true;
                }
            }

        }
        return false;
    }
}

