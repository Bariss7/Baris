package Gun42.ZamanDıgerIslemler;

import java.time.LocalDate;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dun= bugun.minusDays(1);

        //bugün dün den sonra mi
        boolean sonraMı= bugun.isAfter(dun);
        System.out.println("sonraMı = " + sonraMı);

        //bugün dün den önce mi
        boolean onceMi= bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        //bugün dün e eşit  mi
        boolean esitMi= bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        //bugün artık yıl mi
        boolean artikYıl= bugun.isLeapYear();
        System.out.println("artikYıl = " + artikYıl);

        // 2 tarih arasında fark var ise farkın en büyük olduğu verir
        int fark= bugun.compareTo(dun.minusYears(3));
        System.out.println("fark = " + fark);
    }
}
