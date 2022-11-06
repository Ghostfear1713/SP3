import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {


public List<Movie> getMoviesFromFile(BufferedReader reader) throws IOException{

 List<Movie> movies = new ArrayList<>();

 String line;
 while((line = reader.readLine()) != null){
     String[] movieDetails = line.trim().split(";");
     Movie movie = new Movie();
     for(int i = 0; i<movieDetails.length; i++){

         setMovieName(movieDetails,movie,i);
         setMovieYear(movieDetails,movie,i);
         setMovieGenre(movieDetails,movie,i);
         setMovieRating(movieDetails,movie,i);

     }

     movies.add(movie);
 }
return movies;
}


private void setMovieName(String[] movieDetails, Movie movie, int i) {
    if(i<movieDetails.length & i== 0) {
    movie.setName(String.valueOf(movieDetails[i]));
    }
}
private void setMovieYear(String[] movieDetails, Movie movie, int i) {
    if(i<movieDetails.length && i== 1) {
        movie.setYear(Integer.parseInt(String.valueOf(movieDetails[1])));
        }
    }
    private void setMovieGenre(String[] movieDetails, Movie movie, int i) {
        if(i<movieDetails.length & i== 2) {
            movie.setGenre(String.valueOf(movieDetails[2]));
        }
    }
    private void setMovieRating(String[] movieDetails, Movie movie, int i) {
        if(i<movieDetails.length && i== 3) {
            movie.setRating(Double.parseDouble(String.valueOf(movieDetails[3])));
        }
    }
}








   /* public ArrayList<String> movieList() {

        File movieFile = new File("/Users/turan/Documents/GitHub/SP3/Data/ListOfMovies.txt");
        return getStrings(movieFile);

    }

        public ArrayList <String> seriesList(){

            File seriesFile = new File("/Users/turan/Documents/GitHub/SP3/Data/ListOfSeries.txt");
            return getStrings(seriesFile);
        }

    public ArrayList<String> getStrings(File mediaFile) {
        ArrayList<String> mediaData = new ArrayList<>();

        try {
            Scanner input = new Scanner(mediaFile);
            input.nextLine();

            while (input.hasNextLine()) {
                mediaData.add(input.nextLine() + "\n");
            }
            input.close();
        } catch (FileNotFoundException e) {
            mediaData = null;
        }
        return  mediaData;
    }


    }*/





    // Hovedproblemerne i koden:
// - Vi vil gøre det muligt for brugeren at søge efter film og serier, men
// vores Arrayliste er af String, når de i virkeligheden burde være af Movie og Series
// Problemet med dette er at vores fil med alle de film vi har tilgængeligt er en txt. fil
// Derfor kan jeg ikke finde en metode hvorpå vi kan få txt. filen til at ligge i en Arraylist<Movie> og Arraylist<Series>
// For gør vi det så løser vi problemet med ikke at kunne søge efter en specifik film eller serie.
// Ved at filen omdannes til disse typer kan vi benytte os af getname f.eks. men lige nu er dette ikke muligt.
// Head exploding





