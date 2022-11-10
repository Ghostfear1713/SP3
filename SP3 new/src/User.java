import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User extends Main {

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
    public User(String userName, String password) {
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


    public static User UserCreation() throws IOException {

        Scanner scan = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();
        User user = new User("Turan", "Password");
        BufferedWriter userWriter = new BufferedWriter(new FileWriter("/Users/turan/Documents/GitHub/SP3/Data/ListOfUsers.txt", true));


        try {

            System.out.println("Indtast venligst dit ønskede brugernavn");

            String name = scan.nextLine();
            user.setUserName(name);


            System.out.println("Indtast venligst dit ønskede kodeord");

            String password = scan.nextLine();
            user.setPassword(password);


            userList.add(user);
            //System.out.println(userList);

            userWriter.write(user.userName + " " + user.password + "\n");

            userWriter.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return user;
    }


    public static void userlogin() {
        Scanner scanner = new Scanner(System.in);
        File file = new File("Data/ListOfUsers.txt");

        System.out.println("Brugernavn");
        String username = scanner.nextLine();

        System.out.println("Kodeord");
        String password = scanner.nextLine();

        boolean found = false;
        int maxAttempts = 3;
        try {

            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.contains(username) && line.contains(password)) {
                    System.out.println("Login succesfull");
                    System.out.println("Velkommen" + " " + username);
                    Menu.runProgram();
                    break;

                } else if (!scan.hasNextLine()) {
                    //for(int i = 0; i<maxAttempts; i++) {
                        System.out.println(" Brugernavn eller kodeord er forkert");
                        //if(i == maxAttempts){
                      //      System.out.println("Du har prøvet for mange gange. Prøv igen senere");
                        }
                    }

               // }

            //}

        } catch (FileNotFoundException e) {
            System.out.println("We all going to die!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public String toString() {
        return "Name" + " " + userName + " " + "Password" + " " + password;
    }
}











