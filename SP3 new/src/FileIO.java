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

    private ArrayList<String> getStrings(File seriesFile) {
        ArrayList<String> seriesData = new ArrayList<>();

        try {
            Scanner input = new Scanner(seriesFile);
            input.nextLine();

            while (input.hasNextLine()) {
                seriesData.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            seriesData = null;
        }
        return  seriesData;
    }
}





