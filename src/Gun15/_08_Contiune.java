package Gun15;

import java.util.Scanner;

public class _08_Contiune {
    public static void main(String[] args) {
        //girilen bir stringin harflerini teker teker ekrana alt alta olacak
        //şekilde yazdırınız boşlukları yazmasın
        Scanner oku = new Scanner(System.in);
        System.out.print("bir kelime giriniz=");
        String kelime = oku.nextLine();
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == ' ')
                // bir karakter karşılaştırıyorsanız tek tırnak, birden fazla karakter olucaksa çift tırnak

                continue;//boşluk geldiğinde contiune çalışır ve sonrakiler pas geçilir döngü devam eder
            System.out.println(kelime.charAt(i));
        }
    }
}
