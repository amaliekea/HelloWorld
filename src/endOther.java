public class endOther {
    public static void main(String[] args) {
        String a = "cattrcat";
        String b = "caT";
        System.out.println(endOther(a,b));
    }

    public static boolean endOther(String aa, String bb) {
        String a = aa.toLowerCase();
        String b = bb.toLowerCase();

        if (a.length() < b.length()) {
            String startb = b.substring(0, a.length());
            if (a.equals(startb)) {
                return true;
            }
            String slutb = b.substring(b.length() - a.length(), b.length());
            if (a.equals(slutb)) {
                return true;
            }
            return false;
        }
        return endOther(bb,aa);
    }
}
