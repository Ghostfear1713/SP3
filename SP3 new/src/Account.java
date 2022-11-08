import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Account extends User {


    public Account(String nameOfUser, String lastName, String userName, String password, ArrayList<User> users) {
        super(nameOfUser, lastName, userName, password, users);
    }
}




/*
    public static Account UserCreation() {

        Scanner scan = new Scanner(System.in);
        BufferedWriter userWriter = null;
        ArrayList<User> userList = new ArrayList<>();
        File file = new File("/Users/turan/Documents/GitHub/SP3/Data/ListOfUsers.txt");
        System.out.println("Indtast venligst dit ønskede brugernavn");


        try {
            String password = scan.nextLine();
            String usrName = scan.nextLine();
            User user = new User(usrName,password);

            user.setNameOfUser(usrName);


            System.out.println("Indtast venligst dit ønskede kodeord");
            user.setPassword(password);
            password = scan.nextLine();
            user.setPassword(password);
            userList.add(user);

            } catch (Exception e) {
                e.printStackTrace();
            }


       // }
return userList;
    }
    }
*/

