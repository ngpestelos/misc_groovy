package regex;

import java.io.*;
import java.util.regex.*;

// Data Crunching, p. 54
public class AllAddresses {

    // why is there an underscore?
    static String patStr = "([\\w_\\.-]+@[\\w_-]+(\\.[\\w_-]+)*)(.*)";
    
    public static void main(String[] args) {
        try {
            Pattern patObj = Pattern.compile(patStr);
            String filename = "/n/data/email.txt";
            BufferedReader input =
                new BufferedReader(new FileReader(filename));
            // match each line and print group
        } catch (FileNotFoundException e) {
            System.err.println("No such file: " + e);
        } catch (IOException e) {
            System.err.println("Error reading line: " + e);
        }
    }

}
