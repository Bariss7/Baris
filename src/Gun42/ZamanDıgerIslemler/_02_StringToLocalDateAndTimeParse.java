package Gun42.ZamanDıgerIslemler;

import com.sun.deploy.model.LocalApplicationProperties;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        //kullanıcıdan alınan ve string durumunda olan bir time veya tarih
        //bilgisinin time veya tarih değişkenine çevrilmesi
        String strDate="01 25 2020";

        //string değeri tarihe çevirmek için format belirledik
        DateTimeFormatter format= DateTimeFormatter.ofPattern("MM dd yyyy");

        //stringin formatı bu formata uygun olmalı parse ile çevirdik
        LocalDate tarih=LocalDate.parse(strDate,format);

        System.out.println("tarih = " + tarih.format(format));
    }
}

