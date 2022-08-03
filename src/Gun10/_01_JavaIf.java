package Gun10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //baklava dilimi =if
        //girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük diye yazdırınız.
        //algoritma
        //1-basla
        //2-sayı oku
        //3-sayı > 10 ise 10 dan büyük yaz
        //4-dur
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi = oku.nextInt();
        if (sayi > 10) { // evet çıkışı
            System.out.println("10 dan büyük");

        }

    }
}
