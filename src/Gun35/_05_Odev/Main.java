package Gun35._05_Odev;

public class Main {
    public static void main(String[] args) {
        Employees eployee1=new Employees("Fenando",8000,"11/23/2000");

            if (eployee1.ageCalculator() > 18)
                System.out.println("welcome to our company fernando your salary is 80000");
            if (eployee1.ageCalculator() < 18)
                System.out.println("come back when you are 18 years old");
            if (eployee1.ageCalculator() == 18)
                System.out.println("we can have inter with you after that you can have a 80000 salary");
        }



    }



