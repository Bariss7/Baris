package Gun38.Soru3;

public class DMGFile implements ReadFile {
    @Override
    public String open() {
        return "oening dmg";
    }

    @Override
    public String read() {
        return "reaading dmg";
    }

    @Override
    public String save() {
        return "saveing dmg";
    }

    @Override
    public String close() {
        return "closing dmg";
    }
}
