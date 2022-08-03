package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _Odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String : ");
        String string = input.next();

        char[] kume = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            kume[i] = string.charAt(i);
        }
        Arrays.sort(kume);
        String yeniString = dondurme(kume);

        System.out.println(yeniString);

    }
    public static String dondurme(char[] charlar) {
        int sayac = 1;

        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0,j = 1; i < charlar.length; i++,j++) {
            if (i == charlar.length - 1) {
                strings.add(Integer.toString(sayac) + charlar[i]);
                break;
            } else if(charlar[i] == charlar[j]){
                sayac++;
            } else {
                strings.add(Integer.toString(sayac) + charlar[i]);
                sayac = 1;
            }
        }
        String newString = "";

        for (int i=0; i < strings.size(); i++){
            newString += strings.get(i);
        }
        return newString;
    }
}

