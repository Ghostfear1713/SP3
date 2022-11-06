import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/turan/Documents/GitHub/SP3/Data/ListOfMovies.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        FileIO fio = new FileIO();


        boolean stopProgram = false;

        User user = new User("Turan", "Password");


        while (!stopProgram) {
            System.out.println("Velkommen" + " " + user.getUserName());
            System.out.println("Hvad kunne du tænke dig?\n 1. Se en liste over alle film.\n 2. Se en liste over alle serier.\n 3. Se gemte film og serier.\n 4.Søg");
            Scanner choice = new Scanner(System.in);

            List<Movie> movies = fio.getMoviesFromFile(reader);


            switch (choice.nextLine()) {
                case "1":


                    for (Movie m : movies) {
                        System.out.println(m.toString());

                    }
                    break;

                case "4":
                    System.out.println("søger du efter film, eller serie?");

                    switch (choice.nextLine()) {
                        case "film":
                            System.out.println("Hvilken film leder du efter?");
                            String search = choice.nextLine();

                            for (Movie m : movies) {
                                if (m.getName().toLowerCase().contains(search.toLowerCase())) {
                                    System.out.println(m.toString());
                                }

                            }
                            //System.out.println("Denne film findes ikke i vores bibliotek");
                            break;
                    }


                       /* case "2":

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
                                       // choice.nextLine();
                                        String choice1 = choice.nextLine();

                                        File movieFile = new File("/Users/turan/Documents/GitHub/SP3/Data/ListOfMovies.txt");
                                        for (String e : newMovieList.getStrings(movieFile)){

                                            if (choice1.contains(choice.nextLine())) {

                                                System.out.println("Din valgte film" + choice1);
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
                                    }*/

            }

        }
    }
}




