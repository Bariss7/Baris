package Gun30.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();
        cal1.id =1;
        cal1.name="Barış";
        cal1.surname="Özalpay";
        //cal1.password="1234";//bu yazılım açısından
        //burası private oldugundan direk erişilemez

      cal1.sifreAta("Merha");
      cal1.sifreGoster();
    }
}
