package Gun27._01_Ornek;

public class Ornke {
    public static void main(String[] args) {
        //1.adım : person isimli bir class tanımlayınız: name, surname,age
        //2.adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız
        //3.adım : bu degerleri yazdırınız
        //4.adım : dogum gününü bul

        person kisi1=new person();
        kisi1.name ="Barış";
        kisi1.surname="Özalpay";
        kisi1.age=19;

        person kisi2= new person();
        kisi2.name ="hatce";
        kisi2.surname="namlı";
        kisi2.age=20;

        //1.yöntem
        System.out.println("kisi1 = " + kisi1.name);
        System.out.println("kisi1 = " + kisi1.surname);
        System.out.println("kisi1 = " + kisi1.age);

        System.out.println("kisi2 = " + kisi2.name);
        System.out.println("kisi2 = " + kisi2.surname);
        System.out.println("kisi2 = " + kisi2.age);

        System.out.println();
        //2.yöntem
        BilgiYazdir(kisi1);
        BilgiYazdir(kisi2);

        System.out.println();
        //3.yöntem
        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();

        System.out.println();
        kisi1.getBirthYear();
        kisi2.getBirthYear();

        System.out.println();
        kisi1.getInitials();
        kisi2.getInitials();
    }
    public static void  BilgiYazdir(person kisi){
        System.out.println("kisi1 = " + kisi.name);
        System.out.println("kisi1 = " + kisi.surname);
        System.out.println("kisi1 = " + kisi.age);

    }
}
