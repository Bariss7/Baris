package Gun19;

import java.util.Scanner;

public class _17_Odev {
    public static void main(String[] args) {
        // Girilen bir string deki harf sayısı tek ise true , değilse false yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz=");
        String cümle=oku.nextLine();

        String sadeceHarfler=cümle.toLowerCase().replaceAll("^[a-z]","");
        int uzunluk=sadeceHarfler.length();
        if (uzunluk%2==0)
            System.out.println(true);
        else System.out.println(false);
    }
}
