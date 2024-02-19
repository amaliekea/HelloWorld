public class stringE {
    public static void main(String[] args) {
        String str = "heeeello";
        System.out.println(Stringe(str));
    }

    public static boolean Stringe(String str) {

        int antalE = 0;

        for (int e = 0; e < str.length(); e++) {
            String karakterE = str.substring(e, e + 1);
            if (karakterE.equals("e")) {
                antalE++;
            }
        }


        if ((antalE >= 1) && (antalE <= 3)) {
            return true;
        } else {
            return false;
        }
    }


}
