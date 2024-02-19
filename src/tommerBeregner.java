import java.util.Scanner;

public class tommerBeregner {
    public static void main(String[] args) {
        Scanner beregner = new Scanner(System.in);
        final double CENTIMETER_PR_TOMME = 2.54;

        System.out.print("Indtast antal tommer: ");
        double tommer = beregner.nextDouble();
        double centimeterResultat = tommer * CENTIMETER_PR_TOMME;
        System.out.println(tommer + " tommer er " + centimeterResultat + " centimeter.");
    }
}