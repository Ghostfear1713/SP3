import java.util.ArrayList;
import java.util.Scanner;

public class User extends Main{

    private String nameOfUser;
    private String lastName;
    private String userName;
    private String password;
    private ArrayList<User> users;
// Constructor for creating user

    public User(String nameOfUser, String lastName, String userName, String password, ArrayList<User> users) {
        this.nameOfUser = nameOfUser;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.users = users;
    }

    //Log-in constructor
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }


    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<User> users) {
        this.users = users;
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




    public boolean login(String username, String password){
        for (User u : users){
            if(u.getUserName() == username && u.getPassword() == password){
                return true;
            }

        }
        return false;
    }

  /*  public String saveMovie(){
        Scanner scanner = new Scanner(System.in){*/



        }



