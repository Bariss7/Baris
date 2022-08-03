package Mentoring._100622;

import java.util.ArrayList;

public class HolidayDeneme {
    public static void main(String[] args) {
        Holiday holiday1 = new Holiday("Cumhuriyet Bayrami", 29, "Ekim");
        Holiday holiday2 = new Holiday("23 Nisan", 23, "Nisan");
        boolean ayniMi = Holiday.inSameMonth(holiday1, holiday2);
        System.out.println("ayniMi = " + ayniMi);

        Holiday holiday3 = new Holiday("1 Mayis Isci Bayrami", 1, "Mayis");
        Holiday holiday4 = new Holiday("19 Mayis", 19, "Mayis");
        System.out.println("ayniMi = " + Holiday.inSameMonth(holiday3,holiday4));

//        ArrayList<Holiday> holidays=new ArrayList<>();  Bu kismi daha guzel otomatik yapmasi icin constructor a ekledik
//        holidays.add(holiday1);
//        holidays.add(holiday2);
//        holidays.add(holiday3);
//        holidays.add(holiday4);
//        System.out.println("ortalama = " + Holiday.avgDatewhich(holidays));

        for (Holiday holiday: Holiday.list){
            System.out.println("holiday.name = " + holiday.name);
        }

        Holiday.list.add(holiday1);

        for (Holiday holiday: Holiday.list){
            System.out.println("holiday.name = " + holiday.name);
        }
    }
}
