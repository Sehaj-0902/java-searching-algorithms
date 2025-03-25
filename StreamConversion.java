import java.io.*;
import java.util.Scanner;

public class StreamConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path:");
        String filePath = sc.nextLine();
        System.out.println("Enter the character encoding (e.g., UTF-8):");
        String charset = sc.nextLine();

        try {
            // Creating FileInputStream and wrapping it with InputStreamReader and BufferedReader
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, charset);
            BufferedReader br = new BufferedReader(isr);

            String line;
            System.out.println("\nFile Content (decoded as " + charset + "):");

            // Reading file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            isr.close();
            fis.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
        catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported encoding: " + charset);
        }
        catch (IOException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}

/*
Input:
    Enter a file path:
    ..\src\binaryData.dat
    Enter the character encoding (e.g., UTF-8):
    UTF-8
Output:
    File Content (decoded as UTF-8):
    Hello, World!
    This is a sample file for InputStreamReader.
*/