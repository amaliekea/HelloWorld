import java.util.Random;

public class terningkast2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum= 0;
        int forsøg= 0;

        while (sum != 7){
            int terningA = rand.nextInt(6)+1;
            int terningB = rand.nextInt(6)+1;
                    sum = terningA + terningB;
                    forsøg++;
            System.out.println(terningA + " +" + terningB + " =" + sum);
        }
        System.out.println("tillykke du nåede til summen 7, dette tog "+ forsøg + " antal forsøg.");

    }
}
