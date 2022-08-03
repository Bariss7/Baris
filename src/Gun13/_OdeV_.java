package Gun13;

import java.util.Scanner;

public class _OdeV_ {
    public static void main(String[] args) {
        //1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız
        Scanner oku = new Scanner(System.in);
        System.out.print("ayNo =");
        int ayNo = oku.nextInt();
        switch (ayNo) {
            case 1: System.out.print("Ocak 31");break;
            case 2: System.out.print("şubat 28");break;
            case 3: System.out.print("mart 31");break;
            case 4: System.out.print("nisan 31");break;
            case 5: System.out.print("mayıs 31");break;
            case 6: System.out.print("haziran 31");break;
            case 7: System.out.print("temmuz 31");break;
            case 8: System.out.print("ağustos 31");break;
            case 9: System.out.print("eylül 31");break;
            case 10: System.out.print("ekim 31");break;
            case 11: System.out.print("kasım 31");break;
            case 12: System.out.print("aralık 31");break;}


        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.
        System.out.print("üç basamaklı bir sayı giriniz=");
        int sayi = oku.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yüzler = (sayi / 100) % 10;
        switch (yüzler) {
            case 1: System.out.println("yüz");break;
            case 2: System.out.println("ikiyüz");break;
            case 3: System.out.println("üçyüz");break;
            case 4: System.out.println("dörtyüz");break;
            case 5: System.out.println("beşyüz");break;
            case 6: System.out.println("altıyüz");break;
            case 7: System.out.println("yediyüz");break;
            case 8: System.out.println("sekizyüz");break;
            case 9: System.out.println("dokuzyüz");break;
        }
        switch (onlar) {
            case 0: System.out.println("");break;
            case 1: System.out.println("on");break;
            case 2: System.out.println("yirmi");break;
            case 3: System.out.println("otuz");break;
            case 4: System.out.println("kırk");break;
            case 5: System.out.println("elli");break;
            case 6: System.out.println("altmış");break;
            case 7: System.out.println("yetmiş");break;
            case 8: System.out.println("seksen");break;
            case 9: System.out.println("doksan");break;
        }
        switch (birler) {
            case 0: System.out.println("");break;
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dört");break;
            case 5: System.out.println("beş");break;
            case 6: System.out.println("altı");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;
        }
        //3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız
        int randomSayi =(int)(Math.random()*61);
        int randomSayi2 =(int)(Math.random()*61)+20;
        int randomSayison =(int)(Math.random()*(80-20)+1)+20;
        int birler2=randomSayison % 10;
        switch (birler) {
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dört");break;
            case 5: System.out.println("beş");break;
            case 6: System.out.println("altı");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;


        }


        }


    }