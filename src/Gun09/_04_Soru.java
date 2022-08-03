package Gun13.Gun09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz
        // mesela 524 -> 425







        Scanner oku=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz=");
        int sayi= oku.nextInt();

        //524 , 5 2 4 u ayırma lazım -> 4*100+2*10+5
        int yuzler= (sayi/100)%10; //5
        int onlar= (sayi/10)%10; //2
        int birler= sayi%10; //4

        int tersi= birler*100+onlar*10+yuzler;
        System.out.println("tersi = " + tersi);



    }
}
