package Gun17;

public class _15_Odev {
    public static void main(String[] args) {
        //İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.
        int[] sayilar={25,30,30,35,100};
        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];
        }
        System.out.println(toplam);

    }
}
