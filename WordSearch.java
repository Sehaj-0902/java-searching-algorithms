public class WordSearch {
    // Method to find first sentence containing target word
    public static String findFirstSentence(String[] sentences, String targetWord) {
        if (sentences == null) {
            return "Not Found";
        }

        for (String sentence : sentences) {
            if (sentence.contains(targetWord)) {
                return sentence;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "This is programming",
                "Java is a programming language",
                "This is linear search",
                "Performing linear search in Java"
        };

        String targetWord = "Java";
        String result = findFirstSentence(sentences, targetWord);

        System.out.println("First sentence containing the target word:\n" + result);
    }
}

/*
Input:
    String[] sentences = {
        "This is programming",
        "Java is a programming language",
        "This is linear search",
        "Performing linear search in Java"
    };
    String targetWord = "Java";
Output:
    First sentence containing the target word:
    Java is a programming language
*/