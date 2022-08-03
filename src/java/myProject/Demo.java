package myProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    private static User currentUser;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Get Actions From Database
        List<Action> actions = Database.actions;
        // Get Users from Database
        List<User> users = Database.users;

        // Programme starts here ---------------------------------------------------------------------------------------
        while (true){
            System.out.println("Please enter your username: ");
            String username = scan.nextLine();
            System.out.println("Please enter your password: ");
            String password = scan.nextLine();

            if (confirmUsernameAndPassword(users, username, password)){
                System.out.println(" You have successfully logged in");
                break;
            }
            System.out.println("Username or password not correct...Try again");
        }

        // Actions starts here
        while (true){
            System.out.println("Do you want to do now?");
            for (Action action: actions){
                System.out.println("For "+ action.getActionName()+ " please ENTER " + action.getActionCode());
            }
            int userChoice = scan.nextInt();

            switch (userChoice){

                case 1:{

                    System.out.println("Please choose your account to deposit");
                    Account chosenAccount = letUserSelectAnAccount(scan, currentUser);

                    System.out.println("Enter the amount... ");
                    int amountDeposit = scan.nextInt();
                    chosenAccount.depozit(amountDeposit);
                    System.out.println("Your new balance is "+chosenAccount.getAmount()+" dollar");
                    break;

                }

                case 2: {

                    System.out.println("Please choose your account to withdraw");
                    Account chosenAccount = letUserSelectAnAccount(scan, currentUser);

                    System.out.println("How much money you want to withdraw? ");
                    int amountToWithdraw = scan.nextInt();
                    if (chosenAccount.withdraw(amountToWithdraw)){
                        System.out.println("Your balance is "+chosenAccount.getAmount()+" dollar");
                    }
                    System.out.println("You don't have enough balance, try later...");
                    break;

                }

                case 3:{

                    System.out.println("Please enter name of your Relative : ");
                    String name = scan.next();
                    scan.nextLine();
                    System.out.println("Please enter the age of your Relative : ");
                    int age = scan.nextInt();
                    System.out.println("Relative's account Number");
                    int accountNumber = scan.nextInt();

                    Relative relative = Relative.createRelative(name, age, accountNumber);
                    currentUser.addRelative(relative);
                    System.out.println(" You successfully created new Relative... ");
                    break;

                }

                case 4:{
                    System.out.println("Please choose your account to make transfer from");
                    Account chosenAccount = letUserSelectAnAccount(scan, currentUser);

                    System.out.println("Select the Person you want to transfer money to ");
                    for (User user : users){
                        int index = users.indexOf(user) + 1;
                        if(currentUser.getUserName().equalsIgnoreCase(user.getUserName())){
                            System.out.println("For transferring to your own account : "+ index);
                            System.out.println("For transferring to your relative    : 0");
                            continue;
                        }
                        System.out.println("For "+user.getName()+" enter : "+ index);
                    }
                    int choice = scan.nextInt();
                    int relativeIndex = 0;
                    if (choice == 0){
                        List<Relative> relatives = currentUser.getRelatives();
                        for (Relative relative : relatives){
                            System.out.println("For transferring to "+relative.getName()+" enter : "+ (relatives.indexOf(relative) + 1));
                        }
                        relativeIndex = scan.nextInt() - 1;
                    }
                    User selectedUser = choice == 0 ? currentUser.getRelatives().get(relativeIndex) : users.get(choice - 1);
                    Account selectedAccount = letUserSelectAnAccount(scan, selectedUser);

                    while(true){
                        System.out.println("Enter the amount to be transferred :");
                        int amount = scan.nextInt();
                        if (chosenAccount.withdraw(amount)){
                            selectedAccount.depozit(amount);
                            System.out.println("Transfer complete, you sent "+ amount+" Dollar to "+selectedUser.getName()+"'s "+selectedAccount.getAccountNumber()+" account Number");
                            break;
                        }
                        System.out.println("You don't have enough balance to transfer...try again");
                    }
                    break;
                }

                case 5: System.exit(1);
                default:{
                    System.out.println("You didn't make a good choice.. Please log in again...");
                }

            }
        }


    }

    private static Account letUserSelectAnAccount(Scanner scan, User user) {
        for (int i = 1; i <= user.getAccounts().size() ; i++){
            System.out.println("For account number "+user.getAccounts().get(i - 1).getAccountNumber()+ " please select " + i);
        }
        Account chosenAccount = user.getAccounts().get(scan.nextInt() - 1);
        return chosenAccount;
    }

    private static boolean confirmUsernameAndPassword(List<User> users, String username, String password) {

        for (User user : users){
            if (user.getUserName().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)){
                currentUser = user;
                return true;
            }
        }
        return false;
    }
}
