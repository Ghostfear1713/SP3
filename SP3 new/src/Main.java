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


User.userlogin();


       /* String fileName = "/Users/turan/Documents/GitHub/SP3/Data/ListOfMovies.txt";
        String seriesFileName = "/Users/turan/Documents/GitHub/SP3/Data/ListOfSeries.txt";


        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        BufferedReader readSeries = new BufferedReader(new FileReader(seriesFileName));
        FileIO fio = new FileIO();
        List<Movie> movies = fio.getMoviesFromFile(reader);
        List<Series> series = fio.getSeriesFromFile(readSeries);


        while (true) {
            //System.out.println("Velkommen" + " " + user.getUserName());
            System.out.println("Hvad kunne du tænke dig?\n 1. Se en liste over alle film.\n 2. Se en liste over alle serier.\n 3. Se gemte film og serier.\n 4.Søg");
            Scanner choice = new Scanner(System.in);







            switch (choice.nextLine()) {
                case "1":


                    for (Movie m : movies) {
                        System.out.println(m.toString());

                    }
                    break;

                case "2":


                for(Series s : series){
                        System.out.println(s.toString());
                    }
                    break;


                case "4":
                    System.out.println("søger du efter film, eller serie?");

                    switch (choice.nextLine()) {
                        case "film":
                            System.out.println("Hvilken film leder du efter?");
                            String movieSearch = choice.nextLine();

                            boolean found = false;

                            for (Movie m : movies) {
                                if (m.getName().toLowerCase().contains(movieSearch.toLowerCase())) {
                                    System.out.println(m.toString());
                                    found = true;
                                }

                            }
                            if(!found){
                                    System.out.println("Denne film findes ikke i vores bibliotek");
                            break;
                            }
                    }



                            case "serie":
                            System.out.println("Hvilken serie leder du efter");
                            String seriesSearch = choice.nextLine();

                            boolean found = false;

                            for(Series s : series){
                                if(s.getName().toLowerCase().contains(seriesSearch.toLowerCase())){
                                    System.out.println(s.toString());
                                    found = true;
                                }
                            }
                            if(!found){
                                System.out.println("Denne film findes ikke i vores bibliotek");
                                break;
                            }











            }

       }*/
    }
}




