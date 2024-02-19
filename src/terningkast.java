import java.util.Random;

public class terningkast {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int forsøg = 0;

        while (sum != 7) {
            int terningA = rand.nextInt(6) + 1;
            int terningB = rand.nextInt(6) + 1;
            sum = terningA + terningB;
            System.out.println(terningA + " + " + terningB + " = " + sum);
            forsøg++;
        }
        System.out.println("Du nåede til summen 7. Du kom ud af loopet. Det tog " + forsøg + " antal forsøg");

    }
}