import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public String[] fileReader() {

        String[] data = new String[205];

        try {
            Scanner scan = new Scanner(new File("/Users/turan/Documents/GitHub/SP3/.idea/Data/ListOfMedia.txt"));
            for (String d : data) {
                String s = scan.nextLine();
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return data;
    }


}
