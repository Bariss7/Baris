package Gun38.Soru5;

import java.util.ArrayList;

public class Amazon implements deliveryOptions {

    int AmazonMinFreeDelivery = 10000;

    @Override
    public int getTheTotal(ArrayList<String> list) {
        int toplam = 0;

        for (String s : list) {
            if (s.contains("$")) {
                s = s.substring(1);
                if (s.contains("K"))
                s += 1000;
            }

        }
        return toplam;


    }

    @Override
    public String isFreeShipping(ArrayList<String> list) {
        int toplam =getTheTotal(list);
        if (toplam> AmazonMinFreeDelivery)
            return "you are eligible for free delivery";
        else
        return "you need to buy ..... amount of item.";
    }
}
