package Gun17;

public class _10_Odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //Toplamlarını yazdırın.
        int[] sayilar={5,6,8,12,14,19};
        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] %2==0){
                toplam+=sayilar[i];
            }else {
                toplam-=sayilar[i];
            }

        }
        System.out.println(toplam);

    }
}
