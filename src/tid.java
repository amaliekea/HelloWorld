public class tid {
    public static void main(String[] args) {
        int sekund = 35;
        int minut = 10;
        int timer = 11;
        int sekunderSidenMidnat= (timer * 60 * 60) + (minut * 60) + sekund;
        int sekunderPåEtDøgn = 24 * 60 * 60;
        int sekunderTilbagePåDøgnet = sekunderPåEtDøgn - sekunderSidenMidnat;
        int opgaveSlut = (11 * 60 *60) + (25 * 60) + 20;
        int totalTidBrugtPåUdregning = opgaveSlut - sekunderSidenMidnat;


        System.out.println("siden midnat er der gået: " +sekunderSidenMidnat + " sekunder");
        System.out.println("sekunder tilbage af døgnet: " + sekunderTilbagePåDøgnet );
        System.out.println("tid brugt på opgaven " + totalTidBrugtPåUdregning);
    }
}
