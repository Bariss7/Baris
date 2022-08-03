package Gun19;

import java.util.Scanner;

public class _10_Odev {
    public static void main(String[] args) {
        //Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz=");
        String girilen=oku.nextLine();
        int adet=0;
        for (int i = 0; i < girilen.length(); i++) {
            if (girilen.charAt(i)=='b')
                adet++;
        }
        System.out.println(adet);

    }


}
