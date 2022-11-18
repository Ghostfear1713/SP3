import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Scanner;

public class DBMenu {


    public static void runProgramDB() throws IOException {

        DatabaseIO database = new DatabaseIO();


        while (true) {
            System.out.println("Hvad kunne du tænke dig?\n 1. Se en liste over alle film.\n 2. Se en liste over alle serier.\n 3. Se gemte film og serier.\n 4.Søg");
            Scanner choice = new Scanner(System.in);


            switch (choice.nextLine()) {
                case "1":

                    database.movieListDB();

                    break;

                case "2":

                    database.seriesListDB();
                    break;


                    //Denne case er ligesom vores menu switch hvor vi her kommer til at switche på omend bruger skriver film eller serie.
                    // Så switch case 4 "søg" vil først spørger om hvorvidt man vil søge en film eller serie, for derefter at komme ned til denne case
                case "4":
                    SearchinDB searchinDB = new SearchinDB();
                    searchinDB.searchSeries();

            }
        }
    }
}



