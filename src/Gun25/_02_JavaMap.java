package Gun25;

import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        // bir kartvizit uygulamasını 2 kişi için yapınız

        Map<String,String> Bkartvizit=new HashMap<>();
        Bkartvizit.put("isim","Barış");
        Bkartvizit.put("email","baris@gmail.com");
        Bkartvizit.put("adres","Türkiye");
        Bkartvizit.put("telefon","3434344343");

        System.out.println("Bkartvizit.get(\"isim\") = " + Bkartvizit.get("isim"));
        System.out.println("Bkartvizit.get(\"telefon\") = " + Bkartvizit.get("telefon"));

        Map<String,String> kKartvizit=new HashMap<>();
        kKartvizit.put("isim","kadirim");
        kKartvizit.put("email","kadirim@gmail.com");
        kKartvizit.put("adres","Belçika");
        kKartvizit.put("telefon","777777777777");

       Map<String, Map<String,String>>kartDefteri=new HashMap<>();//Maplerin map i
       kartDefteri.put("Barış",Bkartvizit);
       kartDefteri.put("kadirim",kKartvizit);

        System.out.println("kadirim telefonu = " + kartDefteri.get("kadirim").get("telefon"));

        for (Map.Entry<String, Map<String,String>> kartVizit:kartDefteri.entrySet())
            System.out.println("kartVizit = " + kartVizit);
    }
}
