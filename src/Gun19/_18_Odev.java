package Gun19;

import java.util.Scanner;

public class _18_Odev {
    public static void main(String[] args) {
        //Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.
        //Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
        //Örnek: "abc", "cat" --> "abcat"
        //"abc", "dog" -->"abcdog
        Scanner oku=new Scanner(System.in);
        System.out.print("ilk kelime giriniz=");
        String kelime1=oku.nextLine();
        System.out.print("ikinci kelimeyi giriniz=");
        String kelime2=oku.nextLine();
        if (kelime1.charAt(kelime1.length()-1)==kelime2.charAt(0)){
            String sonHarf=kelime1.substring(0,kelime1.length()-1);
            System.out.println(sonHarf+kelime2);
        }
        else System.out.println(kelime1+" "+kelime2);


    }
}
