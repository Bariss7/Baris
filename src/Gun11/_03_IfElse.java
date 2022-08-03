package Gun11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının tek mi çift mi olduğunu bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.print(" sayı girin=");
        int sayı = oku.nextInt();
        if (sayı < 0) {
            sayı *= -1;
        }
        if (sayı % 2 == 1) {
            System.out.println("tek");
        }
        else {
            System.out.println("çift");
        }
    }
}