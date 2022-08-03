package Gun10;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //girilen iki sayıdan büyük olanını değerini ekrana yazdırınız
        //eşit ise esşit yazdırınız
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı 1=");
        int sayi1 = oku.nextInt();

        System.out.print("sayı2=");
        int sayi2 = oku.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("sayı 1 büyük=" + sayi1);
        }
            if (sayi2 > sayi1) {
                System.out.println("sayı 2 büyük=" + sayi2);
            }
                if (sayi1 == sayi2) {
                    System.out.println("sayı 1 ve sayi 2 eşit");
                }

            }

        }

