package Gun38.Soru4;

import java.util.concurrent.Callable;

public class VehicleMain {
    public static void main(String[] args) {
        Biycle biycle = new Biycle();
        Car car =new Car();

        biycle.speedUp(20);
        biycle.changeGear(2);
        biycle.changeGear(3);
        biycle.applyBrakes(5);

        biycle.printAll();

        System.out.println();

        car.speedUp(40);
        car.changeGear(3);
        car.speedUp(70);
        car.applyBrakes(40);

        car.printAll();




    }
}
