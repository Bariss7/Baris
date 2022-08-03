package Gun28._03_Soru;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<lesson> dersleri=new ArrayList<>();

    public void dersekle(lesson ders) {
        //gelen dersin kredisi artı var olan krediyi toplayıp bakcaz
        //kontrol edeceğiz öğrencinin maxkredisi aşıyor mu?
        int toplamalınankredi = 0;
        for (lesson l : dersleri)
            toplamalınankredi += l.credit;

        if (toplamalınankredi + ders.credit <= maxCredit) {
            dersleri.add(ders);
            System.out.println("eklendi = " + ders.name);
        }
        else
            System.out.println("alınabilecek kredi miktarı aşıldı="+ders.name);


    }
}
