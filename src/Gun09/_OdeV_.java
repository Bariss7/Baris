package Gun13.Gun09;

import java.util.Scanner;

public class _OdeV_ {
    public static void main(String[] args) {
        int a=50;
        int b=25;
        System.out.println("bölme işelmi");
        System.out.println("a/b = " + (a/b) );

        int c=78;
        int d=7;
        System.out.println("bölme işlemi");
        int sonuc=c/d;
        System.out.println("sonuc = " + sonuc);

        double f=125;
        double g=225;
        double h=325;
        System.out.println("çarpma işemi");
        double sonuc2=f*g*h;
        System.out.println("sonuc2 = " + sonuc2);

        Scanner oku=new Scanner(System.in);
        int r=22;
        int t=28;
        int y=32;
        int u=45;
        System.out.println("Çarpma işelmi");
        int sonuc3=r*t*y*u;
        System.out.println("sonuc3 = " + sonuc3);

        int p=66;
        int l=99;
        System.out.println("bölme işlemi");
        int sonuc4=(p/l);
        int  q=p&l;
        System.out.println("sonuc4 = " + sonuc4);

        int v=5;
        int n=15;
        int m=25;
        int z=10;
        System.out.println("çıkarma işlemi");
        int sonuc5=(m-n-z-v);
        System.out.println("sonuc5 = " + sonuc5);

        //giirlen bir sayının birler basamağını yazdırınız
        System.out.print("bir sayı giriniz=");
        int sayi=oku.nextInt();
        int birler=sayi%10;
        System.out.println("birler = " + birler);
        //giirlen bir sayının onlar basamağını yazdırınız
        System.out.print("bir sayı giriniz=");
        int sayi2=oku.nextInt();
        int onlar=(sayi/10)%10;
        System.out.println("onlar = " + onlar);
        //giirlen bir sayının yüzler basamağını yazdırınız
        System.out.print("bir sayı giriniz=");
        int sayi3=oku.nextInt();
        int yüzler=(sayi/100)%10;
        System.out.println("yüzler = " + yüzler);
        //vize ve final notu alınız
        int vize1=52;
        int final1=65;
        System.out.print("vize1 notu giriniz=");
        String vize2= oku.next();
        System.out.print("final1 notu giriniz=");
        String final2= oku.next();
        System.out.println("ortalama=0.4*vize1+0.6*final1");
        System.out.println("ortalama = " + (0.4*vize1+0.6*final1));
    }
}
