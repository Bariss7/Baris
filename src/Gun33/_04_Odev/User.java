package Gun33._04_Odev;

import java.util.Scanner;

public class User {
    Scanner oku = new Scanner(System.in);
    private final int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    static int sayac = 0;

    public User(int id, String username, String password, boolean active, boolean signedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Scanner oku = new Scanner(System.in);
        if (password.length() >= 6) {
            this.password = password;
        } else
            do {
                System.out.println("sifrenin 6 karakterden uzun olması gerek");
                System.out.println("yeni sifer giriniz");
                password = oku.next();
                if (password.length() >= 6) {
                    this.password = password;
                }
            } while (password.length() < 6);}

        public boolean isActive () {
            return active;
        }

        public void setActive ( boolean active){
            this.active = active;
        }

        public boolean isSignedIn () {
            return signedIn;
        }

        public void setSignedIn ( boolean signedIn){
            this.signedIn = signedIn;
        }

        @Override
        public String toString () {
            return "User{" +
                    "oku=" + oku +
                    ", id=" + id +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", active=" + active +
                    ", signedIn=" + signedIn +
                    '}';
        }

}
