public class PeakElementFinder {
    // Method to find peak element
    public static int findPeakElement(int[] array) {
        int left = 0;
        int right = array.length - 1;

        // Performing binary search
        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                return array[mid];
            }

            if (array[mid] < array[mid - 1]) {
                right = mid - 1;
            }

            if (array[mid] < array[mid + 1]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 5};

        System.out.println("The peak element is " + findPeakElement(array));
    }
}

/*
Input:
    int[] array = {1, 2, 4, 3, 5};
Output:
    The peak element is 4
*/