package Gun38.Soru3;

public class EXEFile implements ReadFile {
    @Override
    public String open() {
        return "opening exe";
    }

    @Override
    public String read() {
        return "reading exe";
    }

    @Override
    public String save() {
        return "saving exe";
    }

    @Override
    public String close() {
        return "closing exe";
    }
}
