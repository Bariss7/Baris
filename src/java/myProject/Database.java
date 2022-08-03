package myProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<User> users = new ArrayList<>();
    public static List<Action> actions = new ArrayList<>();

    static {

        User user1 = new User("Ozgur","ozgurtechno", "ozgur1122", LocalDate.of(1980,03,23), MarriageStatus.MARRIED);
        user1.addAccount(12468655, 1000);
        user1.addAccount(76897970, 2000);
        users.add(user1);

        User user2 = new User("Ismet","ismetTechno", "ismet1122", LocalDate.of(1975,06,14), MarriageStatus.SINGLE);
        user2.addAccount(767677888, 5000);
        user2.addAccount(444499400, 7000);
        users.add(user2);

        // Actions
        actions.add(new Action("Deposit Money  :", 1));
        actions.add(new Action("Withdraw Money :", 2));
        actions.add(new Action("Add Relative   :", 3));
        actions.add(new Action("Transfer Money :", 4));
        actions.add(new Action("Exit", 5));

    }



}
