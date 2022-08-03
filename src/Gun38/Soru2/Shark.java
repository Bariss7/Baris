package Gun38.Soru2;

public class Shark implements Salling{
    public Shark(String sadece_yüzebilir) {

    }

    @Override
    public String food() {
        return "sadece yüzebilir";
    }

    @Override
    public String sail() {
        return "hızlı yüzer";
    }

}
