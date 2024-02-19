import java.util.Scanner;

public class sentine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int tal = 0;
        int sentinel = -1;

        System.out.println("programmet stoppes ved at taste -1");

        while (tal != sentinel) {
            sum += tal;
            System.out.println("indtast de tal der skal lægges sammen");
            tal = scanner.nextInt();
        }
        System.out.println("summen er " + sum);
    }
}

/*
  while (tal != sentinel) {
            System.out.println("indtast de tal der skal lægges sammen");
            tal = scanner.nextInt();
            if (tal != -1) {
                sum += tal;
            }
            System.out.println("summen er " + sum);
 */