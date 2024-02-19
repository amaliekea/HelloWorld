import java.util.Scanner;

public class tidsberegner {
    public static void main(String[] args) {
        Scanner tidsberegner = new Scanner(System.in);

        System.out.println("Hvor mange timer er der gået?");
        int timer = tidsberegner.nextInt();
        System.out.print("Indtil videre er der gået " + timer + " timer. ");


        System.out.println("Hvor mange minutter er der gået?");
        int minutter = tidsberegner.nextInt();
        System.out.print("Indtil videre er der gået " + minutter + " minutter. ");


        System.out.print("Hvor mange sekunder er der gået?");
        int sekunder = tidsberegner.nextInt();
        System.out.print("Indtil videre er der gået " + sekunder + " sekunder. ");
        System.out.println("Det var godt nok tidskrævende haha! ");

        int omregnetTilSekunder = (timer * 60*60)+(minutter*60)+sekunder;
        System.out.print("Dette er i alt: " + timer + " timer, " + minutter + " minutter," + " og " + sekunder + " sekukunder er gået. Dette svarer til i alt " + omregnetTilSekunder + " sekunnder");
    }
}
