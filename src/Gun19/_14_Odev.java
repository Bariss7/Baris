package Gun19;

import java.util.Scanner;

public class _14_Odev {
    public static void main(String[] args) {
        //Girilen bir sayıya kadar olan çift sayıları (0 ve girilen sayı dahil) yazdırınız.
        //Example 1:
        //int input = 10;
        //print 0 2 4 6 8 10 olmalı
        //Example 2:
        //int input = 15;
        //print 0 2 4 6 8 10 12 14 olmalı
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz=");
        int sayi= oku.nextInt();
        for (int i = 0; i < sayi; i=i+2) {
            System.out.print(i+" ");

        }
    }
}
