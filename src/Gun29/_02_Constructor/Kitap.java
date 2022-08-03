package Gun29._02_Constructor;

public class Kitap {
    String name;
    int publishYear;
    String author;

    //yapıcı method : constructor metod

    public Kitap(){//1.constructor
    }
    //2.constructor
    public Kitap(String name, int publishYear, String author){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;
    }
    //3.constructor
    public Kitap(String name, int publishYear){
        this.name=name;
        this.publishYear=publishYear;
        this.author="";
    }
    public void Yazdir(){
        System.out.println(name+" "+publishYear+" "+author);
    }
    public String toString(){
        return name+" "+publishYear+" "+author;
    }


}
