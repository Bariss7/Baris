package Gun08;

import java.util.Scanner;

public class _OdeV_ {
    public static void main(String[] args) {
        //girilne 3 kelimelik kelimelerin ilk harflerini bulunuz
        Scanner oku1 = new Scanner(System.in);
        System.out.print("bir cumle giriniz=");
        String cumle = oku1.nextLine();
        System.out.println("ilk harfler = " + cumle.replaceAll("\\B\\S", ""));
        //girilen bir kelimenin içerisinde B harfi geçip geçmediğini bulunuz
        System.out.print("bir kelime giriniz=");
        String kelime = oku1.nextLine();
        boolean varMı = kelime.contains("B");
        System.out.println("varMı = " + varMı);
        //Girilen bir kredi kartı bilgisini yandaki şekilde gösterin **** **** **** 4567
        System.out.print("Kredi kartı bilgilerinizi giriniz=");
        String kredikartı = oku1.nextLine();
        kredikartı = kredikartı.trim().replace(" ", "");
        String son4hane = kredikartı.substring(kredikartı.length() - 4, kredikartı.length());
        System.out.println("kredi kartınızın son 4 hanesi: " + "**** **** ****" + son4hane);
        // girilen bir cümledeki son kelimeyi yazdırınız
        System.out.print("Bir cumle giriniz=");
        String cumle2 = oku1.nextLine();
        String sonKelime = cumle.substring(0, cumle.lastIndexOf(" "));
        System.out.println("sonKelime = " + sonKelime);

    }
}
