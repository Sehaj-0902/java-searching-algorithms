public class ReverseString {
    public static void main(String[] args) {
        String inputString = "hello";

        // Creating a StringBuilder object
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(inputString);

        // Reversing the string using reverse() method
        reverseString.reverse();

        System.out.println("String before reversing: " + inputString);
        System.out.println("String after reversing: " + reverseString.toString());
    }
}

/*
Input:
    String inputString = "hello";
Output:
    String before reversing: hello
    String after reversing: olleh
 */