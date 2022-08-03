package Gun19;

import java.util.Scanner;

public class _09_Odev {
    public static void main(String[] args) {
        //Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi=oku.nextInt();
        if (sayi%2==1)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
