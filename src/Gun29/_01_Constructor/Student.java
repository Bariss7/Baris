package Gun29._01_Constructor;

public class Student {
    int id;
    String name;
    String surname;
    int classroom;

    public Student(){
        this(0,"","",0);
        //System.out.println("nesne oluşturuldu");
    }
    public Student(int id1,String name1, String surname1, int classroom1){
       this.id=id;
       this.name=name;
       this.surname=surname;
       this.classroom=classroom;
    }
    public Student(int id1, String name1, String surname1){
        this(id1,name1,surname1,0);
    }
    public Student(int id1, String name1){
        this(id1,name1,"",0);
    }
    public Student(int id1){
        this(id1,"","",0);
    }



}
