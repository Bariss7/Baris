package Gun19;

public class _06_Odev {
    public static void main(String[] args) {
        //1- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız.
        // Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.
        int[] dizi = new int[]{3, 9, 26, 34};
        int enKucuk = dizi[0];
        int enBuyuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }
        System.out.println("enBuyuk=" + enBuyuk);
        System.out.println("enKucuk=" + enKucuk);
        System.out.println("toplam=" + (enBuyuk - enKucuk));}


    }