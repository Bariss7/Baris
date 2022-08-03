package Gun38.Soru5;

import java.util.ArrayList;
import java.util.Collections;

public class DeliveryMain {
    public static void main(String[] args) {
        Amazon amazon=new Amazon();
        Costco costco=new Costco();

        ArrayList<String> sepet = new ArrayList<>();
        Collections.addAll(sepet,"$3K","$200","$1K");

        System.out.println(amazon.isFreeShipping(sepet));
        System.out.println(costco.isFreeShipping(sepet));
    }
}
