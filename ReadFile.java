# Assignment-1-PHPimport java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String [] args) {

        // File name yg nak access.
        String fileName = "FirdausShahruddin-a1.txt";

        // create sop utk 1 line shj
        String line = null;

        try {
            // Declare fileReader.
            FileReader fileReader = 
                new FileReader(fileName);

            // declare fileReader dalam BufferedWriter..
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Tutup File.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            
        }
    }
}
