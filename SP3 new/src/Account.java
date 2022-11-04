import java.util.ArrayList;
import java.util.Scanner;

public class Account extends User{

    private ArrayList<User> users;

    public Account(int ageOfUser, String userName, String password) {
        super(ageOfUser, userName, password);
    }


    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public Scanner getUserInput = new Scanner(System.in);

    public void addUsers(User e){
        users.add(e);
    }

}
