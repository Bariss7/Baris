package Gun12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("kaça kadar sayı tutulsun =");
        int kacakadarRandomSayi=oku.nextInt();

        int tutulanSayi = (int) (Math.random()*kacakadarRandomSayi);

        System.out.print("tahminiz=");
        int tahmin= oku.nextInt();
        //1.yöntem
        if(tutulanSayi==tahmin)
            System.out.println("tebrikler");
        else
            System.out.println("bilemedin ki bilemedin ki");
        //2.yöntem
        System.out.println( ((tutulanSayi==tahmin) ? "tebrikler" : "bilemedin ki bilemedin ki") );
        System.out.println("tutulanSayi = " + tutulanSayi);



    }
}
