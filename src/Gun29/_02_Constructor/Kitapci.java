package Gun29._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,autor.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        Kitap kit1=new Kitap();//1.constructor
        kit1.name="ince mehmet";
        kit1.publishYear=1990;
        kit1.author="Yaşar Kemal";

        //1.constructor
        Kitap kit2=new Kitap("Nutuk",1927,"Atatürk");

        Kitap kit3=new Kitap("Nutuk",1927);//3.constructor

        kit1.Yazdir();
        kit2.Yazdir();
        kit3.Yazdir();

        System.out.println(kit1);
        //zaten herzaman ekrana yazacağı zaman
        //tostring metodunu arar
        String yazıHali=kit2.toString();


    }
}
