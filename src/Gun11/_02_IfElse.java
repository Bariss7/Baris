package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Ben buraya(kursa) neden geldim ?

        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("vize=");
        int vizeNotu = oku.nextInt();
        System.out.print("final=");
        int finalNotu = oku.nextInt();
        double ort = vizeNotu * 0.4 + finalNotu * 0.6;

        //int ortInt= (int)(vizeNotu * 0.4) + (int)(finalNotu * 0.6);
        if (ort >= 60) {
            System.out.println("geçtiniz, ort=" + ort);
        } else {
            System.out.println("kaldınız ort=" + ort);
        }


    }
}
