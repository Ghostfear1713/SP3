import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainMenu extends Account {


    public MainMenu(int ageOfUser, String userName, String password) {
        super(ageOfUser, userName, password);

    }


    public void mainDisplay() {

        while (true) {
            boolean stopProgram = false;

            while (!stopProgram) {
                System.out.println("Velkommen" + getUserName());
                System.out.println("Hvad kunne du tænke dig?\n 1. Se en liste over alle film.\n 2. Se en liste over alle serier.\n 3. Se gemte film og serier.\n 4.Søg");
                Scanner choice = new Scanner(System.in);
                int newMenuNumberInt;

                switch (choice.nextLine()) {
                    case "1":

                        while (true) {


                            FileIO movieList = new FileIO();

                            System.out.println(movieList.movieList());
                        break;}



                            case "2":

                                while(true){
                                    FileIO seriesList = new FileIO();

                                    System.out.println(seriesList.seriesList());
                                    break;}



                        }
                }

            }
        }
    }



