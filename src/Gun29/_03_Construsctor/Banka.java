package Gun29._03_Construsctor;

public class Banka {
    String adi;
    int subeSayuisi;
    int kurulusYılı;

    public Banka() {
    }

    public Banka(String adi, int subeSayuisi, int kurulusYılı) {
        this.adi = adi;
        this.subeSayuisi = subeSayuisi;
        this.kurulusYılı = kurulusYılı;
    }

    public Banka(String adi, int subeSayuisi) {
        this.adi = adi;
        this.subeSayuisi = subeSayuisi;
    }
    public Banka(int kurulusYili,String adi){
        this.adi=adi;
        this.subeSayuisi=subeSayuisi;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayuisi=" + subeSayuisi +
                ", kurulusYılı=" + kurulusYılı +
                '}';
    }
}
