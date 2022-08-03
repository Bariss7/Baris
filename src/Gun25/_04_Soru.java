package Gun25;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.lang.invoke.SwitchPoint;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- silme
        // 6- Çıkış
        Map<String,String> sozluk=new TreeMap<>();
        Scanner okuInt=new Scanner(System.in);
        Scanner oku=new Scanner(System.in);
        String kelime="";
        String anlamı="";
        int secim=0;
        do{
            System.out.println("Menü\n1 - Ekleme\n2 - Düzeltme\n3 - Listeleme\n4 - Arama\n5 - Silme\n6");
            secim = okuInt.nextInt();

            switch (secim){
                case 1: // ekleme işlemi
                    System.out.print("kelimeyi giriniz=");
                    kelime= oku.nextLine();
                    System.out.print("Anlamını giriniz=");
                    anlamı= oku.nextLine();
                    sozluk.put(kelime,anlamı);
                    break;
                case 2: // düzeltme işlemi
                    //TODO : kelime varmı yok mu kontrolü yapılacak
                    System.out.print(" Düzeltilecek kelimeyi giriniz=");
                    kelime= oku.nextLine();
                    System.out.print("Anlamını giriniz=");
                    anlamı= oku.nextLine();
                    sozluk.put(kelime,anlamı);
                    break;
                case 3:// listeleme işlemi
                    System.out.println("sozluk = " + sozluk);
                    break;
                case 4:// arama işlemi : kelimenin bir harfini giridginde yine ne yakın kelimeyi bulsun

                    break;
                case 5:// silme işlemi
                    break;
            }

        }while (secim<6);

        // TODO : bütün işlemler burda yapıldıktan sonra, metod ile bütün işlemleri ayırınız




    }
}
