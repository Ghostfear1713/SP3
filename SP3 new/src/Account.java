import java.util.ArrayList;
import java.util.Scanner;

public class Account extends User{


    public Account(String nameOfUser, String lastName, String userName, String password, ArrayList<User> users) {
        super(nameOfUser, lastName, userName, password, users);
    }

    public Scanner getUserInput = new Scanner(System.in);


    public ArrayList<Movie> savedMovielist() {
        return null;

    }


    public String watchedMovie(Scanner getUserInput){
        return null;
    }

}
