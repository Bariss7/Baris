package Gun39.Ornek3;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava b=new Baklava();
        b.madeln();
        b.taste();

        System.out.println();

        CheeseCake cc=new CheeseCake();
        cc.madeln();
        cc.taste();
        GreekSalad gs=new GreekSalad();
        gs.madeln();
        gs.taste();
        SezarSalad ss=new SezarSalad();
        ss.madeln();
        ss.taste();
    }
}
