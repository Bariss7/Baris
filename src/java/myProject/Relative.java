package myProject;

public class Relative extends User {

    private int age;

    public Relative(String name, int age) {
        super(name);
        this.age = age;
    }

    public static Relative createRelative(String name, int age, int accountNumber){
        Relative relative = new Relative(name, age);
        relative.addAccount(accountNumber, 0);
        return relative;
    }


    @Override
    public String toString() {
        return "Relative{" +
                "name='" + super.getName() + '\'' +
                ", age=" + age +
                '}';
    }
}
