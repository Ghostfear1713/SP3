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
                mediaData.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            mediaData = null;
        }
        return  mediaData;
    }
}





