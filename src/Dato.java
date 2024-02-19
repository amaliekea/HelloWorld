public class Dato {
    public static void main (String[] args) {
        int year = 2023;
        String month = "January";
        int date = 31;
        String day = "Wednesday";

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(day);
        System.out.println("Dato amerikansk format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("Dato europærisk format: " + day + " " + date + " " + month + " " + year);
    }
}
