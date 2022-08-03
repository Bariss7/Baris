package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) throws InterruptedException {
        //tarih içermez saaat dak san nana san içerir
        LocalTime saat= LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        //kendimize özel format
        DateTimeFormatter ozelFormat1= DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat = " + saat.format(ozelFormat1));

        DateTimeFormatter ozelFormat3= DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat = " + saat.format(ozelFormat3));

        // canlı saat
        DateTimeFormatter ozeLformat2= DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true){
            saat= LocalTime.now();
            System.out.print("\rsaat = " + saat.format(ozeLformat2));

            Thread.sleep(1000); // 1 sn bekleyecek
        }


    }
}
