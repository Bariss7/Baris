package Gun17;

public class _12_Odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.
        int[] sayilar={12, 14 , 21 ,23 , 10 ,4};
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        toplam /= sayilar.length;
        System.out.println(toplam);

        }

    }

