package Gun06;

import java.util.Scanner;

public class _OdeV_ {
    public static void main(String[] args) {
        String cümle="I love java";
        int uzunluk=cümle.length();
        System.out.println("uzunluk = " + uzunluk);

        String dize="Sprint planning";
        int uzunluk2=cümle.length();
        System.out.println("uzunluk2 = " + uzunluk2);

        String kelime="apple";
        boolean varMı=kelime.contains("app");
        System.out.println("varMı = " + varMı);

        String s1="orange";
        String s2="Apple";
        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        String s3="apple";
        String s4="apple";
        System.out.println("s3.equals(s4) = " + s3.equals(s4));

        Scanner oku=new Scanner(System.in);
        String k1="Florida";
        System.out.println("2.Harf(indexe göre) = " + kelime.charAt(2));

        String k2="Thank you";
        System.out.println("(y) = " + kelime.indexOf("y"));

        String k3="Mouse";
        System.out.println("3.Harf(indexe göre) = " + kelime.charAt(3));

        System.out.print("3 kelimelik isim giriniz=");
        String adAdSoyad=oku.nextLine();
        char ilkHarf=adAdSoyad.charAt(0);
        char ikinciHarf= adAdSoyad.charAt(adAdSoyad.indexOf(" ")+1);
        char ucuncuHarf= adAdSoyad.charAt(adAdSoyad.lastIndexOf(" ")+1);
        System.out.println("kısa hali = " + ilkHarf+"."+ikinciHarf+"."+ucuncuHarf);
    }
}
