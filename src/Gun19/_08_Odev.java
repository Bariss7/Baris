package Gun19;

import java.util.Scanner;

public class _08_Odev {
    public static void main(String[] args) {
        //Kullanıcıdan yaş bilgisini isteyiniz
        //Eğer yaş 10 dan küçük veya eşit ise
        //"facebook hesabi acmak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 16 dan küçük veya eşit ise
        //"ehliyet almak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 18 den küçük veya eşit ise
        //"dovme yaptirmak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 21 den küçük veya eşit ise
        //"alkol icmek icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 21 den büyük ise
        //"istediğini yapabilirsin" şeklinde yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("yaş giriniz=");
        int yas=oku.nextInt();
        System.out.println((yas<=10)?"facebook hesabı açmak için çok gençsin"
                          :(yas<=16)?"ehliyet almak için çok gençsin"
                          :(yas<=18)?"dövme yaptırmak içi n çok gençsin"
                          :(yas<=21)?"alkol içmek için çok gençsin"
                          :"istediğini yapabilirsin");

    }
}
