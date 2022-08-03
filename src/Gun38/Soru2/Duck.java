package Gun38.Soru2;

public class Duck implements Flying, Salling, Animal {

    public Duck(String hem_uçar_hem_yüzer) {

    }
    @Override
    public String food() {
        return "Hem uçabilir hem yüzebilir";
    }

    @Override
    public String sail() {
        return "yüzer";
    }
}
