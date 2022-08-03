package Gun19;

import java.util.Scanner;

public class _15_Odev {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir sayı alınız ve 0 ile girilen sayı arasında
        // random int tipinde bir  sayı ürerten programı yazınız girilen sayı üretilen sayıya dahil olmalı
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz=");
        int sayi= oku.nextInt();

        int randomSayi=(int)(Math.random()*sayi+1);
        System.out.println(randomSayi);
    }
}
