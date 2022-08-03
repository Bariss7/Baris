package Gun41.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {
    public static void main(String[] args) {
        //2 tarih arasındaki farkı gosterir.
        //localdate ler için kullanılır.
        LocalDate dogumTarihi= LocalDate.of(2002,11,9);
        LocalDate bugun= LocalDate.now();

        Period fark= Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("Fark="+fark.getYears()+" yıl "+ fark.getMonths()+" ay");

        //*********************************//
        Period period3gun=Period.ofDays(7);
        Period period3ay=Period.ofMonths(3);

        LocalDate ucGunSonra=bugun.plus(period3gun);
        LocalDate ucAySonra= bugun.plus(period3ay);

        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucAySonra = " + ucAySonra);

        //örnek kursun süresi
        LocalDate kursunBaslangici=LocalDate.of(2022,4,18);
        Period kursSure= Period.ofMonths(6);
        LocalDate kursBitis= kursunBaslangici.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        Period kacGunKaldi = Period.between(bugun,kursBitis);
        System.out.println("kacGunKaldi = " + kacGunKaldi);

    }
}
