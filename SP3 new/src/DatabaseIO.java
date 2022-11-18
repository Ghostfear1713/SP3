import com.mysql.cj.xdevapi.SqlStatement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseIO {

    public ArrayList<Series> seriesArrayList = new ArrayList<>();
    private ArrayList<Movie> movieListDatabase = new ArrayList<>();




    public void seriesListDB() {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/SP3test", "root", "Tingbjerg1!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT* FROM SeriestList");

            while (resultSet.next()) {

                String sName = resultSet.getString("sName");
                String sYear = resultSet.getString("sYear");
                String sGenre = resultSet.getString("sGenre");
                String sRating = resultSet.getString("sRating");
                String sSeasonAndEpisodes = resultSet.getString("sSeasonAndEpisodes");

                Series series = new Series(sName, sYear, sGenre, sRating, sSeasonAndEpisodes);
                this.seriesArrayList.add(series);


            }
            for (Series s : seriesArrayList) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("hahahah");
        }


    }


    public void movieListDB() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp3test", "root", "Tingbjerg1!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from movielist");

            while (resultSet.next()) {


                String MovieName = resultSet.getString("MovieName");
                String MovieYear = resultSet.getString("MovieYear");
                String MovieGenre = resultSet.getString("MovieGenre");
                String MovieRating = resultSet.getString("MovieRating");

                Movie movies = new Movie(MovieName, MovieYear, MovieGenre, MovieRating);
                this.movieListDatabase.add(movies);
            }

            for (Movie s : movieListDatabase) {
                System.out.println(s);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

