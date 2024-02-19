public class øvelse {
    public static void main(String[] args) {
        int[] myArray1 = new int[8];
        myArray1[0] = 34; //jeg assigner værdien
        myArray1[myArray1.length - 1] = 117; //jeg assigner den sidste værdi til 117
//for loop
        for (int i = 0; i <= myArray1.length - 1; i++) { //starter i index 0, kører indtil længden af mit array, inkrementer med 1
            System.out.print(myArray1[i] + ", ");
        }
        System.out.println();

        String[] wordss = {"hej", "med", "dig"};
        for (int i = 0; i <= wordss.length - 1; i++) {
            System.out.print(wordss[i] + " ");
        }
        System.out.println();
//for each loop
        String[] words = {"hej", "med", "dig"};
        for (String i : words)
            System.out.print(i + " ");

        //array med doubles
        System.out.println();
        double[] numre = {3.4, 2.5, 1.2, 6.7};
        System.out.println(numre[2]);
    }
}