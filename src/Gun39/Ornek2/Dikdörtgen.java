package Gun39.Ornek2;

public class Dikdörtgen extends Sekil {
    private double kisakenar;
    private   double uzunkenar;

    public double getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(double kisakenar) {
        this.kisakenar = kisakenar;
    }

    public double getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }

    public Dikdörtgen(double kisakenar, double uzunkenar) {
        setKisakenar(kisakenar);
        setUzunkenar(uzunkenar);
    }

    @Override
    public double alan() {
        return kisakenar*uzunkenar;
    }

    @Override
    public double cevre() {
        return (kisakenar+uzunkenar)*2;
    }
}
