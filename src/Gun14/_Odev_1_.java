package Gun14;

import java.util.Scanner;

public class _Odev_1_ {
    public static void main(String[] args) {
        //0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz
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
            System.out.println("tekler = " + toplam);
        }
        if(sayac%2==0)
            toplam=toplam+sayac;
        sayac++;
        System.out.println("çiftler = " + toplam);
       
        
    }
}
