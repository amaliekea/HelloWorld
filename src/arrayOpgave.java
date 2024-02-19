public class arrayOpgave {
    public static void main(String[] args) {
        int[] myArray = new int[8];
        myArray [0]=34;
        myArray [7]=117;

        for (int i = 0; i <= myArray.length-1; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        String[] myArray2 = {"hej", "med", "dig"};
        for (int i = 0; i <= myArray2.length-1; i++) {
            System.out.print(myArray2[i] + " ");
        }
        //kan også skrives ved et for each loops
        for(String i : myArray2) {
            System.out.println(i + " ");
        }

        System.out.println();

        double[] array3 = { 3.4, 2.5, 1.2, 6.7 };
        System.out.println(array3[3]);
        System.out.println(array3.length);
    }
}
