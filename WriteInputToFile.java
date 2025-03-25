import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteInputToFile {
    public static void main(String[] args) {
        // Creating InputStreamReader to read input from console and wrapping it in BufferedReader
        // Creating FileWriter to write input to the file
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("userInput.txt")) {

            System.out.println("Enter lines of text (type 'exit' to finish):");

            String line;
            while (true) {
                System.out.print("> ");
                line = reader.readLine();

                if (line == null || line.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(line + System.lineSeparator());
            }

            System.out.println("Input saved to userInput.txt");

        }
        catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

/*
Output:
    Enter lines of text (type 'exit' to finish):
    > Hello, World!
    > This is InputStreamReader.
    > exit
    Input saved to userInput.txt
*/