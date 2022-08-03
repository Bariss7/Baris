package Gun14;

import java.util.Scanner;

public class _OdeV_ {
    public static void main(String[] args) {
        //1-Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuzç
        Scanner oku = new Scanner(System.in);
        System.out.print("Kaç kadar Sayılar çarpılacak =");
        int sinir=oku.nextInt();

        int sayac=1;
        int çarpım=2;

        while (sayac <= sinir){
            çarpım= çarpım + sayac;
            sayac++;
        }
        System.out.println("çarpım = " + çarpım);

    }

}
