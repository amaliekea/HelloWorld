import java.util.Scanner;
public class bmiBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double højde;
        double vægtKilo;

        System.out.println("Indtast dn højde i meter:");
        højde = input.nextDouble();
        System.out.println("Indtast din vægt i kilo?");
        vægtKilo = input.nextDouble();

        double bmiResultat = vægtKilo / (højde * højde);
        System.out.print("Du har en BMI på " + bmiResultat + ", ");

        if (bmiResultat < 18.5) {
            System.out.print("du er undervægtig.");
        } else if (bmiResultat >= 18.5 && bmiResultat< 25) {
            System.out.print("du er normalvægtig.");
        } else if (bmiResultat >= 25 && bmiResultat< 30) {
            System.out.print("du er overvægtig.");
        } else {
            System.out.print("du er svært overvægtig.");
        }

        }
    }

