public class StringConcatenation {
    // Method to concatenate strings
    public static String concatenateString(String[] stringArray) {
        StringBuffer resultString = new StringBuffer();

        for (String s : stringArray) {
            resultString.append(s);
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        String[] stringArray = {"This " , "is ", "programming"};

        String concatenatedString = concatenateString(stringArray);

        System.out.println("String after concatenation: " + concatenatedString);
    }
}

/*
Input:
    String[] stringArray = {"This " , "is ", "programming"};
Output:
    String after concatenation: This is programming
*/