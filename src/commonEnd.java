public class commonEnd {
        public static void main(String[] args) {
            int[] a = new int[9];
            int[] b = new int[9];
            a[0] = 1;
            b[0] = 2;
            a[8] = 1;
            b[8] = 2;

            System.out.println(commonEnd(a,b));
        }

    public static boolean commonEnd(int[] a, int[] b) {
            return (a[0]==b[0] || a[a.length-1]==b[b.length-1]);
        }
    }

