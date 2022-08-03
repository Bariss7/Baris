package Gun19;

import java.util.Scanner;

public class _13_Odev {
    public static void main(String[] args) {
        //Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false
        //yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz=");
        int sayi = oku.nextInt();
        int sayac = 1;
        int arananSayi = 0;
        while (sayac < sayi) {
            if (sayac * sayac == sayi) {
                arananSayi = sayac;
                break;
            }
            sayac++;
        }
        if (arananSayi > 0)
            System.out.println(true);
        else
            System.out.println(false);

        }
    }



