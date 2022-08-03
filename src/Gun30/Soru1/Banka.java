package Gun30.Soru1;

public class Banka {
    public static void main(String[] args) {
        //Musteri (hesapID, ad, soyad, MusteriHesap(hesap tipinde))
        //Hesap (yatan,cekilen,bakiye)(direk erişim olmamalı))
        //bir banka uyugulaması içni 1 müşteri tanımlayınız,
        //müşterini hesabına sırasıyla 100 tl,200 tl yatırnız,
        //sonra 50 tl çekiniz. müşterinin kalan bakiyesini yazdırınız
        //bakiye direk para atanamadıgını kontrol ediniz.
        Musteri mus1=new Musteri();
        mus1.hesapID=1;
        mus1.ad="Barış";
        mus1.soyad="Özalpay";
        mus1.musteriHesap=new Hesap();

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println("Extre = " + mus1.musteriHesap);

        //mus1.musterihesap.bakiye ulasılamıyor testi geçti


    }
}
