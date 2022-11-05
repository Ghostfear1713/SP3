import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu extends Account {


    FileIO newMovieList = new FileIO();
    FileIO newSeriesList = new FileIO();


    public MainMenu(int ageOfUser, String userName, String password) {
        super(ageOfUser, userName, password);

    }


    public void mainDisplay() {


        while (true) {
            boolean stopProgram = false;

            while (!stopProgram) {
                System.out.println("Velkommen" + " " + getUserName());
                System.out.println("Hvad kunne du tænke dig?\n 1. Se en liste over alle film.\n 2. Se en liste over alle serier.\n 3. Se gemte film og serier.\n 4.Søg");
                Scanner choice = new Scanner(System.in);


                switch (choice.nextLine()) {
                    case "1":

                        while (true) {


                            FileIO movieList = new FileIO();

                            System.out.println(movieList.movieList());
                            break;
                        }
                        break;


                    case "2":

                        while (true) {
                            FileIO seriesList = new FileIO();

                            System.out.println(seriesList.seriesList());
                            break;
                        }
                        break;

                    case "3":


                        break;

// IN PROGRESS!
                    case "4":

                        System.out.println("søger du efter film, eller serie?");

                        switch (choice.nextLine()) {
                            case "film":
                                while (true) {

                                    System.out.println("Hvilken film leder du efter?");
                                    choice.nextLine();
                                    ArrayList<String> array = new ArrayList<>();
                                    array = newMovieList.movieList();

                                    for (String e : newMovieList.movieList()) {
                                        array.add(e);
                                        if (array.contains(choice.nextLine())) {
                                            System.out.println("Din valgte film" + e);
                                            break;
                                        } else System.out.println("Den film findes ikke");
                                        break;
                                    }
                                    break;
                                }
                            case "serie":
                                while (true) {
                                    System.out.println("Hvilken serie leder du efter?");
                                    choice.nextLine();

                                    for (String e : newSeriesList.seriesList()) {
                                        if (e.equals(choice.nextLine())) {
                                            System.out.println("Din valgte serie" + e);
                                            break;
                                        } else System.out.println("Den serie findes ikke");
                                        break;

                                    }
                                }

                        }

                }
            }
        }
    }
}








