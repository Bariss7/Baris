package Gun19;

import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class _07_Odev {
    public static void main(String[] args) {
        // 2- 2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi ve rakam olan değerlerle doldurunuz.
        // sonrasında bütün RAKAMLARI toplayıp ö toplam para değerini bulunuz.
        Scanner oku = new Scanner(System.in);
        String[][] dizeler = new String[2][3];
        int toplam = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("para miktarlı sayısal değerler=");
                dizeler[i][j] = oku.nextLine();
                int sayisalHali = Integer.parseInt(dizeler[i][j].replaceAll("[^0-9]", ""));
                toplam += sayisalHali;
            }

        }
        System.out.println(toplam);
    }

}

















































































































