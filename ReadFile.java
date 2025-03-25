import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path:");
        String filePath = sc.nextLine();

        try {
            // Creating FileReader and wrapping it with BufferedReader
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nFile Content:");

            // Reading file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
        catch (IOException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}

/*
Output:
    File Content:
    Hello World!
    This is a sample text file for file reader.
*/