import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchinDB {
    private ArrayList<Series> serieslist = new ArrayList<>();
    private Scanner choice = new Scanner(System.in);
    private boolean found;


    public void searchSeries() {


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
                serieslist.add(series);

            }

            System.out.println("Hvilken serie leder du efter");
            String seriesSearch = choice.nextLine();

            for (Series s : serieslist) {
                if (s.getName().toLowerCase().contains(seriesSearch.toLowerCase())) {
                    System.out.println(s.toString());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Denne film findes ikke i vores bibliotek");

            }
        } catch (SQLException e) {
            System.out.println("Datafejl");
        }


    }

}