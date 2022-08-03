package Gun17;

import java.util.Scanner;

public class _16_Odev {
    public static void main(String[] args) {
        //1- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz
        Scanner oku = new Scanner(System.in);
        String[] kelimeler = new String[5];

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.print("Kelime : ");
            String kelime = oku.next();
            kelimeler[i] = kelime;
        }

        String eWord = kelimeler[0];
        int eLenght = kelimeler[0].length();

        for (int i=0;i<kelimeler.length;i++){
            if (kelimeler[i].length() > eLenght) {
                eLenght = kelimeler[i].length();
                eWord = kelimeler[i];
            }
        }

        char c1 = eWord.charAt(0);
        char c2 = eWord.charAt(eLenght - 1);

        String newWord = eWord.replace(c1,c2);

        newWord = newWord.substring(0,eLenght-1) + c1;
        System.out.println(newWord);



    }
}
