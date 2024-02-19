import java.util.Scanner;

public class lavSelvScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi!! what's ur name?");
        String name = scanner.nextLine();
        System.out.println("seeeejt hvordan har du det? " + name );
        String wellBeing = scanner.nextLine();
        System.out.println("er du træt?");
        String help = scanner.nextLine();
        System.out.println("okay, men amalie er træt, vil du gøre noget ved det " + name + " ?");
        String sur = scanner.nextLine();
        System.out.println("din hund " + name);
    }
}
