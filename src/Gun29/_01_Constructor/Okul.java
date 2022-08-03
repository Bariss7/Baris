package Gun29._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        //bir Student sınııfı oluşturunuz
        // (id,name,surname,classroom(int)ve
        //bundan 3 adet öğrenci oluşturunuz

        Student ogr1=new Student();
        ogr1.id=1;
        ogr1.name="Barış";
        ogr1.surname="Özalpay";
        ogr1.classroom=7;
        System.out.println("ogr1.name = " + ogr1.name);

        Student ogr2=new Student();
        ogr2.id=2;
        ogr2.name="Barış";
        ogr2.surname="Özalpay";
        ogr2.classroom=9;
        System.out.println("ogr2.name = " + ogr2.name);
        //2.yöntem
        Student ogr3=new Student(3,"Barış","Özalpay",9);
        System.out.println("ogr3.name = " + ogr3.name);

        Student ogr4=new Student(4,"Barış","Özalpay",9);
        Student ogr5=new Student(5,"Barış","Özalpay",9);
        Student ogr6=new Student(6,"Barış");
        Student ogr7=new Student(7);








    }
}
