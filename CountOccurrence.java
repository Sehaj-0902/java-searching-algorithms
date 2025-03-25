import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        System.out.print("Enter the word to search: ");
        String searchWord = sc.nextLine();

        int wordCount = 0;

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Reading file line by line
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

                // Splitting line into words and checking occurrences
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(searchWord.toLowerCase())) {
                        wordCount++;
                    }
                }
            }

            br.close();
            fr.close();

            System.out.println("\nThe word '" + searchWord + "' appears " + wordCount + " times in the file.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

/*
Input:
    Enter the file path: ..\src\FileReaderExample.txt
    Enter the word to search: is
Output:
    The word 'is' appears 1 times in the file.
*/