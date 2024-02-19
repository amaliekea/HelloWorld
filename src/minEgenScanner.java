import java.util.Scanner;
public class minEgenScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hi whats ur name?");
        String name = scanner.nextLine();
        System.out.println("hi " + name + " how old are u?");
        int age = scanner.nextInt();
        System.out.println(name + " whats ur GPA?");
        String gpa = scanner.next();
        System.out.println("that is a good " + gpa + " what is your favorite quote?");
        String quote = scanner.nextLine();
    }
}
