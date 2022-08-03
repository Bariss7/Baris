package myProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String userName;
    private String password;
    private LocalDate dateOfBirth;
    private MarriageStatus marriageStatus;
    private List<Account> accounts = new ArrayList<>();
    private List<Relative> relatives = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public User(String name, String userName, String password, LocalDate dateOfBirth, MarriageStatus marriageStatus) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.marriageStatus = marriageStatus;
    }

    public void addRelative(Relative relative){
        this.relatives.add(relative);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(int accountNumber, int amount) {
        this.accounts.add(new Account(accountNumber, amount));
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return this.name;
    }

    public List<Relative> getRelatives() {
        return relatives;
    }
}
