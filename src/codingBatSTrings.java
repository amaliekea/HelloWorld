public class codingBatSTrings {
    public static void main(String[] args) {
        String code = "cofe";
        System.out.println(countCode(code));
    }

    public static int countCode(String str) {
        int countCode = 0;

        for (int i = 0; i < str.length()-3; i++) {
            String minStr =str.substring(i, i+2)+"f"+str.substring(i+3,i+4);
            if (minStr.equals("cofe")) {
                countCode++;

            }
        }
        return countCode;
    }
}




