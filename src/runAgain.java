import java.util.Scanner;

public class runAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int afspilIgen = 0;

        do{
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum is: " + sum);

            System.out.println("Would you like to start over? Enter 1 for yes. 2 for No ");
            afspilIgen = scanner.nextInt();
        }while(afspilIgen ==1);
    }
}
