package Gun10;

import java.util.Scanner;

public class _OdeV_ {
    public static void main(String[] args) {
        //Girilen 1 sayının onlar basamağının tek olup olmadıüını yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi = oku.nextInt();
        int onlar = (sayi / 10) % 10;
        if (sayi % 2 == 1) {
            System.out.println("tek");
        }
        if (sayi % 2 == 0) {
            System.out.println("tek değil");
            //Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.
            System.out.print("bir kelime giriniz=");
            String kelime=oku.next();
            System.out.println("ilk harf = " + kelime.replaceAll("\b", "\b"));
            System.out.println("son harf = " + kelime.replaceAll("\\b","\\b"));





        }
    }
}