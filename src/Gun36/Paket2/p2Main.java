package Gun36.Paket2;

import Gun36.Paket1.P1Hayvan;

public class p2Main {
    public static void main(String[] args) {

        P1Hayvan h2 = new P1Hayvan();
        h2.ad = "köpük";

        P2Kedi kedi1 = new P2Kedi("kopuk", "scottish");
        System.out.println("kedi1 = " + kedi1);
    }
}
