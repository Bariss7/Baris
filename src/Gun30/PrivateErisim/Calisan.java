package Gun30.PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surname;
    private String password;

    public void sifreAta(String sifre){
        if (sifre.length()<8)
            System.out.println("lütfen kurala uygun sifre giriniz");
        else {
            this.password=sifre;
            System.out.println("sifre başarıyla atandı");
        }
    }
    public  void sifreGoster(){
        if (password.length()>=8)
            System.out.println("****" + password.substring(4));
    }
}
