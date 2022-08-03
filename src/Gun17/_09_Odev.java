package Gun17;

import javax.swing.*;

public class _09_Odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        // Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
    int[] sayilar={15,25,22,18,30};
    int max =sayilar[0];
    int max2= sayilar[0];
        for (int i = 0; i <sayilar.length ; i++) {
            if(sayilar[i]>max){
                max=sayilar[i];
            }
        }
        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]>max2 && sayilar[i]<max){
                max2 = sayilar[i];
            }

        }
        System.out.println(max2);

}}
