package Gun39.Ornek2;

public class Geometri {
    public static void main(String[] args) {
        Dikdörtgen d=new Dikdörtgen(4,5);
        d.setName("Diktörtgen");
        System.out.println("d = " + d);
        d.ciz();

        Daire dr=new Daire(5);
        dr.setName("Daire");
        System.out.println("dr = " + dr);
        dr.ciz();


    }
}
