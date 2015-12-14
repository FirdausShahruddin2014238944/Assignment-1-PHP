# Assignment-1-PHP


import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class WriteFile {
    public static void main(String [] args) {

        // File name yg nak create.
        String fileName = "FirdausShahruddin-a1.bin";

        try {
            // Declare fileWriter.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // declare fileWriter dalam BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // bufferedWriter.write untuk kluarkan char
            // newline untuk spacing .
            bufferedWriter.write("Name: Firdaus Bin Shahruddin");
            bufferedWriter.newLine();
            bufferedWriter.write("Matrix No: 2014238944");
            bufferedWriter.newLine();
            bufferedWriter.write("Gender: Male");
            bufferedWriter.newLine();
            bufferedWriter.write("Age: 27");
            bufferedWriter.newLine();
            bufferedWriter.write("E-mails: firdasyah@gmail.com");
            bufferedWriter.newLine();
            bufferedWriter.write("Mobile Phones: 016-4158551");

            //Tutup file.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
          
        }
    }
}
