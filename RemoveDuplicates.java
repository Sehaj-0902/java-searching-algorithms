import java.util.HashSet;

public class RemoveDuplicates {
    // Method to remove duplicates from a string
    public static String removeDuplicates(String inputString) {
        StringBuilder result = new StringBuilder();

        HashSet<Character> set = new HashSet<>();

        for (char ch : inputString.toCharArray()) {
            if (set.add(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "Programming";
        String updatedString = removeDuplicates(inputString);

        System.out.println("String before removing duplicates: " + inputString);
        System.out.println("String after removing duplicates: " + updatedString);
    }
}

/*
Input:
    String inputString = "Programming";
Output:
    String before removing duplicates: Programming
    String after removing duplicates: Progamin
 */