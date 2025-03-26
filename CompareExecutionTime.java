import java.io.*;
import java.util.Scanner;

public class CompareExecutionTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        compareStringConcatenationTime();

        System.out.println("\nEnter the file path:");
        String filePath = sc.nextLine();
        compareFileReadingTime(filePath);
    }

    // Method to compare time taken by StringBuilder and StringBuffer to concatenate list of strings
    static void compareStringConcatenationTime() {
        int iterations = 1000000;
        String string = "hello";

        // Concatenating strings using StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(string.repeat(iterations));
        long endTimeBuilder = System.nanoTime();
        long durationTimeBuilder = (endTimeBuilder - startTimeBuilder) / 1000000;

        // Concatenating strings using StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append(string.repeat(iterations));
        long endTimeBuffer = System.nanoTime();
        long durationTimeBuffer = (endTimeBuffer - startTimeBuffer) / 1000000;

        System.out.println("Execution Time for String Concatenation: \nUsing StringBuilder: " + durationTimeBuilder + "ms \nUsing StringBuffer: " + durationTimeBuffer + "ms");
    }

    // Method to compare time taken by FileReader and InputStreamReader to read a file
    static void compareFileReadingTime(String filePath) {
        // Counting words using FileReader
        long startTimeFR = System.nanoTime();
        int wordCountFR = countWordsFR(filePath);
        long endTimeFR = System.nanoTime();
        long durationTimeFR = (endTimeFR - startTimeFR) / 1000000;

        // Counting words using InputStreamReader
        long startTimeISR = System.nanoTime();
        int wordCountISR = countWordsISR(filePath);
        long endTimeISR = System.nanoTime();
        long durationTimeISR = (endTimeISR - startTimeISR) / 1000000;

        System.out.println("\nFile word count: \nUsing FileReader: " + wordCountFR + " words \nUsing InputStreamReader: " + wordCountISR + " words");
        System.out.println("\nExecution Time for Counting File Words : \nUsing FileReader: " + durationTimeFR + "ms \nUsing InputStreamReader: " + durationTimeISR + "ms");
    }

    // Method to count words using FileReader
    static int countWordsFR(String filePath) {
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            return countWords(br);
        } catch (FileNotFoundException e) {
            System.out.println("Error: No file found.");
            return 0;
        }
    }

    // Method to count words using InputStreamReader
    static int countWordsISR(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            return countWords(br);
        } catch (FileNotFoundException e) {
            System.out.println("Error: No file found.");
            return 0;
        }
    }

    // Method to count words
    static int countWords(Reader r) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(r)) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        }
        catch (IOException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
        return count;
    }
}

/*
Input:
    Enter the file path:
    ..\src\largeText.txt
Output:
    Execution Time for String Concatenation:
    Using StringBuilder: 8ms
    Using StringBuffer: 8ms

    File word count:
    Using FileReader: 131 words
    Using InputStreamReader: 131 words

    Execution Time for Counting File Words :
    Using FileReader: 5ms
    Using InputStreamReader: 4ms
 */