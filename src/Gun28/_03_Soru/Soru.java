package Gun28._03_Soru;

public class Soru {
    public static void main(String[] args) {
        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Ders Class : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
        // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini
        //    tutacak bir liste
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
        //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

        lesson ders1=new lesson();
        ders1.name="Mat101";
        ders1.credit=4;

        lesson ders2=new lesson();
        ders2.name="Java101";
        ders2.credit=4;

        lesson ders3=new lesson();
        ders3.name="Alg101";
        ders3.credit=6;

        Student ogr1=new Student();
        ogr1.name="Barış";
        ogr1.maxCredit=10;

        // bu dersleri sırasıyla ekleyeceğiz alabileceği toplma krediyi gecene kadar

        ogr1.dersekle(ders1);
        ogr1.dersekle(ders2);
        ogr1.dersekle(ders3);

    }
}
