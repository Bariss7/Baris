package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        //kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        //yaptıktan sonra main de yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayı=");
        int sayi1= oku.nextInt();
        System.out.print("2.sayı=");
        int sayi2= oku.nextInt();

        int enb=enBuyukBul(sayi1,sayi2);
        System.out.println("enb = " + enb);

        //_01_JavaMrthod.enBul(sayi1,sayi2); diğer programdan fonksiyon çağırma
        //Gun20._06_JavaMethod.faktoriyelYaz(sayi1); diğer paketten çağırma

    }
    public static int enBuyukBul(int s1, int s2){
        if (s1>s2)
            return s1;
        else
            return s2;
    }



}
