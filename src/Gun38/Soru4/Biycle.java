package Gun38.Soru4;

public class Biycle implements Vehicle{
    private int speed;
    private int gear;

    public Biycle() {

    }


    @Override
    public void changeGear(int gear) {
        this.gear=gear;

    }

    @Override
    public void speedUp(int speed) {
        this.speed+=speed;

    }

    @Override
    public void applyBrakes(int brakes) {
        this.speed-=brakes;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void printAll(){
        System.out.println("current speed is"+this.getSpeed()+ "SPEED gear count is"+this.getGear());
    }
}
