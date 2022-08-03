package Gun17;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        //kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz
        int[] dizi1 = new int[7];
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
            if (dizi1[i] > ortalama && dizi1[i] % 2 == 1) {
                System.out.println(dizi1[i]);
                adet++;
            }

        }
        System.out.println("adet = " + adet);}

    }