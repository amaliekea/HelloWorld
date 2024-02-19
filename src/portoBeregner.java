import java.util.Scanner;

public class portoBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pris = 0;
        int vægt;
        String message = "Porto pris: " + pris + " kr.";

        System.out.println("Indtast dit brevs vægt i hele gram:");
        vægt = input.nextInt();

        if (vægt <= 0 || vægt > 500) {
            System.out.println("Et brev med denne vægt kan vi ikke sendes");
        } else if (vægt <= 100) {
            pris = 25;
        } else if (vægt > 100 && vægt <= 250) {
            pris = 50;
        } else if (vægt > 250 && vægt < 2000) {
            pris = 75;
        }
       // System.out.println(;"Porto pris: " + pris);
        System.out.println(message);
    }
}
