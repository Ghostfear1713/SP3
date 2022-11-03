import java.util.ArrayList;
import java.util.Scanner;

public class Account extends User{
    private String userName;
    private String password;
    private ArrayList<User> users;


    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public Scanner getUserInput = new Scanner(System.in);

    public ArrayList<User> addUsers(User e){
        users.add(e);
        return users;
    }

}
