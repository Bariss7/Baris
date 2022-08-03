package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        //başka zaman bolgelerinin zaman dilimlerini alma

        ZonedDateTime zdtLokal=ZonedDateTime.now();
        //su andaki bolgenin saatini verdi yani lokal zaman
        System.out.println("zdt = " + zdtLokal);

        //ZonedDateTime zdtIstanbul = ZonedDateTime.now(ZoneID);
        Set<String> zamanBolgeleri= ZoneId.getAvailableZoneIds();
        for (String z: zamanBolgeleri){
            if (z.toLowerCase().contains("stan")){
            System.out.println("z = " + z);}
        }
        //Europe/Istanbul Aasia/Istanbul
        //şimdi bu stringden bir zoneıd oluşturalım
        ZoneId zoneIST= ZoneId.of("Europe/Istanbul");
        ZonedDateTime zdtIST=ZonedDateTime.now(zoneIST);
        System.out.println("zdtIST = " + zdtIST);

        DateTimeFormatter gosterimSablonu=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm");
        System.out.println("zdt = " + zdtIST.format(gosterimSablonu));

    }
}
