package Gun33._04_Odev;

import java.util.ArrayList;

public class UserMain {
    public static void main(String[] args) {
        ArrayList<User>userArrayList=new ArrayList<>();
        userArrayList.add(new User(7,"Barış","ozalpay7",true,false));
        System.out.println("userArrayList = " + userArrayList);
        userArrayList.add(new User(9,"Ozalpay7","997799",false,true));
        System.out.println("userArrayList = " + userArrayList);
    }
}
