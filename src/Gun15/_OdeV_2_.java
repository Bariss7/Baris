package Gun15;

import java.util.Scanner;

public class _OdeV_2_ {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i=1;i<=10;i++)
        {
            System.out.print("bir sayı giriniz=");
            int sayi = oku.nextInt();
            if (sayi%2==0)
                continue;
            else
                System.out.println("döngü bitti");
            toplam = toplam + sayi;
            System.out.println("toplam = " + toplam);
        }

    }
}
