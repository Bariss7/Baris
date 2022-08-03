package Gun17;

import java.util.Arrays;

public class _11_Odev {
    public static void main(String[] args) {
       //Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
        // ilk ve son elementlerini kapsayan yeni array'e return edin.
        int[] sayilar={7,9,26,34};
        int[] yeniSayilar=new int[2];

        yeniSayilar[0]=sayilar[0];
        yeniSayilar[1]=sayilar[sayilar.length-1];

        System.out.println(Arrays.toString(yeniSayilar));

    }
}
