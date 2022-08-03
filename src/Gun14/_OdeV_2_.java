package Gun14;

import java.util.Scanner;

public class _OdeV_2_ {
    public static void main(String[] args) {
        //3-100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Kaç kadar Sayılar toplanacak =");
        int sinir=oku.nextInt();

        int sayac=1;
        int toplam=0;
        int randomSayison =(int)(Math.random()*(100-0)+1)+0;

        while (sayac <= sinir){

            if (sayac%2 ==1 )
                toplam=toplam+sayac;  // toplanacak sayıları sayac

            sayac++;
        }
        System.out.println("toplam = " + toplam);

    }
}
