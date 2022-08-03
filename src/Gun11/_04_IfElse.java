package Gun11;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {
        //mantıksal lojik ifadeler
        // && -> ve || -> veya
        // girilen sayı pozitif ve tek ise uygun sayı
        // değilse uygun sayı girilmedi
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi =oku.nextInt();

        if (sayi > 0 && sayi%2==1){
            System.out.println("uygun sayı girildi");
        }
        else
        {
            System.out.println("uygun sayı girilmedi");
        }
    }
}
