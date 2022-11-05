import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {



    public ArrayList<String> movieList() {

        File movieFile = new File("/Users/turan/Documents/GitHub/SP3/Data/ListOfMovies.txt");
        return getStrings(movieFile);

    }

        public ArrayList <String> seriesList(){

            File seriesFile = new File("/Users/turan/Documents/GitHub/SP3/Data/ListOfSeries.txt");
            return getStrings(seriesFile);
        }

    private ArrayList<String> getStrings(File mediaFile) {
        ArrayList<String> mediaData = new ArrayList<>();

        try {
            Scanner input = new Scanner(mediaFile);
            input.nextLine();

            while (input.hasNextLine()) {
                mediaData.add(input.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            mediaData = null;
        }
        return  mediaData;
    }


    }





    // Hovedproblemerne i koden:
// - Vi vil gøre det muligt for brugeren at søge efter film og serier, men
// vores Arrayliste er af String, når de i virkeligheden burde være af Movie og Series
// Problemet med dette er at vores fil med alle de film vi har tilgængeligt er en txt. fil
// Derfor kan jeg ikke finde en metode hvorpå vi kan få txt. filen til at ligge i en Arraylist<Movie> og Arraylist<Series>
// For gør vi det så løser vi problemet med ikke at kunne søge efter en specifik film eller serie.
// Ved at filen omdannes til disse typer kan vi benytte os af getname f.eks. men lige nu er dette ikke muligt.
// Head exploding





