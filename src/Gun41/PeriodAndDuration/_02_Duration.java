package Gun41.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _02_Duration {
    public static void main(String[] args) {
        //localtime ve localDatetime
        //arasındaki farkları gösterir
        LocalTime geceYarisi= LocalTime.of(0,0);
        LocalTime ogleVakti= LocalTime.of(13,3,2);

        Duration fark= Duration.between(geceYarisi,ogleVakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());
        System.out.println("fark.toMillis() = " + fark.toMillis());
        System.out.println("fark.getSeconds() = " + fark.getSeconds());
        
        //localdatettime *** 2 zaman farkı***
        LocalDateTime from= LocalDateTime.of(2020,10,4,10,20,55);
        LocalDateTime to= LocalDateTime.of(2020,11,15,11,21,57);
        
        Duration farkZaman= Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());
        System.out.println("farkZaman.toMillis() = " + farkZaman.toMillis());
        

    }

}
