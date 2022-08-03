package Gun11;

import java.util.Scanner;

public class _Odev_ {
    public static void main(String[] args) {
        // Girilen 3 sayıdan büyük olanı yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz= ");
        int s1= oku.nextInt();
        System.out.print("İkinci sayıyı giriniz= ");
        int s2= oku.nextInt();
        System.out.print("Üçüncü sayıyı giriniz= ");
        int s3= oku.nextInt();
        int buyuk;

        if (s1>s2 && s1>s3)
        { buyuk = s1; }
        else {if (s2 > s3){ buyuk = s2 ;}
        else { buyuk = s3;}}
        System.out.println("En büyük= " + buyuk);
        //Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.
        System.out.print("sayi giriniz=");
        int sayi = oku.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;

        if (birler % 2 == 1 && birler == onlar) {
            System.out.println("uygundur");
        } else {
            System.out.println("uygun değildir");
        }
        //Girilen bir keliede bosluk veya A harfinin olup olmadığını kontrol ediniz.
        System.out.print("bir Kelime giriniz=");
        String kelime = oku.next();
        if (kelime.contains(" ") | kelime.contains("A")) {
            System.out.println("uygundur");
        } else {
            System.out.println("uygun değildir");
        }


    }
}
