package Gun17;

public class _08_Odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.
        int[]sayilar={14,9,5,21};
        int min=sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]<min){
                min=sayilar[i];
            }

        }
        System.out.println(min);


    }
}
