package Gun14;

import java.io.Console;
import java.util.Scanner;

public class _OdeV_3_ {
    public static void main(String[] args) {
        //4-0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayac = 0, sayi = 1;
        while (sayi <= 100) {
            if (sayi % 4 == 0 && sayi % 5 == 0){
            System.out.println("sayi = " + sayac);
            }
        sayac++;
    }
    }
}














