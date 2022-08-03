package Gun15;

import java.util.Scanner;

public class _OdeV_3_ {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz.
        System.out.print("sayi giriniz=");
        int sayi= oku.nextInt();
        int basamak = 0; while (sayi != 0) { sayi /= 10; basamak++; }
        System.out.println("basamak = " + basamak);



    }
}
