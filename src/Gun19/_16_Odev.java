package Gun19;

import java.util.Scanner;

public class _16_Odev {
    public static void main(String[] args) {
        //Girilen 2 sayı arasında Random integer sayı üreten programı yazınız
        Scanner oku=new Scanner(System.in);
        System.out.print("ilk sayı giriniz=");
        int sayi1=oku.nextInt();
        System.out.print("ikinci sayıyı giriniz=");
        int sayi2=oku.nextInt();
        int randomSayı=(int)(Math.random()*(sayi2-sayi1)+sayi1);
        System.out.println(randomSayı);


    }
}
