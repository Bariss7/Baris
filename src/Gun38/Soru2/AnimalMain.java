package Gun38.Soru2;

import Gun38.Soru1.Vehicle;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Duck duck=new Duck("hem uçar hem yüzer");
        Shark shark=new Shark("sadece yüzebilir");
        Cat cat=new Cat("sadece yemek yer");
        Swallow swallow=new Swallow("sadece uçabilir");

        ArrayList<Animal> hayvanlar=new ArrayList<>();
        hayvanlar.add(duck);
        hayvanlar.add(shark);
        hayvanlar.add(cat);
        hayvanlar.add(swallow);
        for (Animal a :hayvanlar){
            System.out.println(a.getClass().getSimpleName());
            System.out.println("-------------------------");

            System.out.println("swallow = " + swallow);
            System.out.println("cat = " + cat);
            System.out.println("shark = " + shark);
            System.out.println("duck = " + duck);

        }
    }
}
