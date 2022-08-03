package Gun12;

import java.util.Scanner;

public class _OdeV_ {
    public static void main(String[] args) {
        //3- Girilen 3 sayıdan en küçük olanını bulunuz.
        Scanner oku = new Scanner(System.in);
        System.out.print("a değeri =");
        int a = oku.nextInt();
        System.out.print("b değeri =");
        int b = oku.nextInt();
        System.out.print("c değeri =");
        int c = oku.nextInt();
        System.out.println("enk = " + Math.min(a, Math.min(b, c)));
        //2- Girilen bir sayı
        //Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        //Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();
        if (sayi % 9 == 0 && sayi % 5 == 0) {
            System.out.println("Able to divide by 9 and 5");
        }
        if (sayi % 4 == 0 && sayi % 5 == 0) {
            System.out.println("Able to divide by 4 and 5");
        } else {
        }
        //4.Girilen bir string
        //Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        //Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
        //Aksi halde (else) "no money" yazdırın.
        System.out.print("parabirimi giriniz=");
        String currency = oku.next();
        if (!currency.contains("€") && !currency.contains("$")) {
            System.out.println("No Money");
        } else {
            if (currency.contains("€")) { // evet euro var yazdır
                System.out.println("This is euro");
            }
            if (currency.contains("$")) { // evet euro var yazdır
                System.out.println("This is dollar");
            }
            // 5-Soru
            // Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
            // Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
            System.out.print("Quiz Notunu Giriniz =");
            int quiz = oku.nextInt();
            System.out.print("Vize Notunu Giriniz =");
            int vize = oku.nextInt();
            System.out.print("Final notunu Giriniz =");
            int ffinal = oku.nextInt();

            int ortalama = ((quiz + vize + ffinal) / 3);

            if (ortalama >= 90) {
                System.out.println("Not = 'A'=" + ortalama);
            } else {
                if (ortalama >= 70) {
                    System.out.println("Not = 'B'=" + ortalama);
                } else {
                    if (ortalama >= 50) {
                        System.out.println("Not = 'C'=" + ortalama);
                    } else {
                        System.out.println("Not = 'F'=" + ortalama);
                    }
                    //1-kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
                        // bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.
                    Scanner oku2=new Scanner(System.in);
                        System.out.print("Tam sayıyı Giriniz =");
                        String num1= oku2.next();
                        System.out.print("Tam sayıyı Giriniz =");
                        String num2= oku2.next();

                        double birlesikhalii=Double.parseDouble(num1.concat(".").concat(num2));

                        System.out.println("Double Olarak Birleştirilmiş Hali = " + birlesikhalii);




                }
            }

        }


    }


}

