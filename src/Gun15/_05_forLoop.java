package Gun15;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //girilen bir sayıya kadar olan sayıların çarpımını bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi=oku.nextInt();

        int çarpım=1;

        for (int i=1;i<=sayi;i++){
            çarpım=çarpım*i;
        }
        System.out.println("çarpım = " + çarpım);

    }
}
