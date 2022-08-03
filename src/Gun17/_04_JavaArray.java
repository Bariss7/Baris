package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınınz kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz daha sonra ortalamadan büyük eleman sayısını bulunuzu
        int[] dizi1 = new int[5];
        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int i = 0; i < dizi1.length; i++) {
            System.out.print((i + 1) + ".değer giriniz=");
            dizi1[i] = oku.nextInt();
            toplam = toplam + dizi1[i];
        }
        double ortalama = toplam / dizi1.length;
        System.out.println("ortalama = " + ortalama);

        int adet = 0;
        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] >= ortalama)
                System.out.println(dizi1[i]);
                adet++;
        }
        System.out.println("ortalamadan büyük sayı miktarı=" + adet);


    }


}



