import java.util.Scanner;

public class onRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("playing current song");
            System.out.println("Do you want to take the song off repeat? if so, answer yes");
        String input =scanner.next();

        if ("yes".equals(input)) {
            isOnRepeat = false;
        }
        }
        System.out.println("playing next song");
    }
}
