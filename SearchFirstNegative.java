public class SearchFirstNegative {
    // Method to find first negative number
    public static int findFirstNegative(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, -5, 6};
        int index = findFirstNegative(array);

        System.out.println("The first negative number found at index " + index);
    }
}

/*
Input:
    int[] array = {1, 2, -3, 4, -5, 6};
Output:
    The first negative number found at index 2
 */