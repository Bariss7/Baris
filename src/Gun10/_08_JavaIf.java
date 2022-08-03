package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının birler ve onlar
        //basamağını eşit olup olmadığını yazdırınız
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi = oku.nextInt();

        int birler = sayi & 10;
        int onlar = (sayi / 10) % 10;

        if (birler == onlar) {
            System.out.println("eşit");
        }
        if (birler != onlar) {
            System.out.println("eşit değil");
        }

    }
}