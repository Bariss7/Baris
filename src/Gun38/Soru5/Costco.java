package Gun38.Soru5;

import java.util.ArrayList;

public class Costco implements deliveryOptions {
    int CostcoMinFreeDelivery = 15000;
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
        if (toplam> CostcoMinFreeDelivery)
            return "Print you are eligible for free delivery";
        else
            return "print you need to buy ..... amount of item.";
    }
}
