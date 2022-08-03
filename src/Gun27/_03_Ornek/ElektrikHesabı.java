package Gun27._03_Ornek;

public class ElektrikHesabı {
    int toplamTuketim=0;
    double birimfiyat=0.7;//birimfiyat
    double fatura=0;

    public void tuketimekle(int tuketim){
        toplamTuketim+=tuketim;
    }
    public void ToplamTuketimYaz(){
        System.out.println("toplamTuketim = " + toplamTuketim);
    }
    public void odenecekTutar(){
        fatura = birimfiyat*toplamTuketim;
        System.out.println("Ödenecek Tutar = " + fatura);
    }
}

