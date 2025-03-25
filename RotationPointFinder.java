public class RotationPointFinder {
    // Method to find rotation point
    public static int findRotationPoint(int[] array) {
        int left = 0;
        int right = array.length - 1;

        // Performing binary search
        while (left != right) {
            int mid = left + ((right - left) / 2);

            if (array[mid] > array[right]) {
                left = mid + 1;
            }

            if (array[mid] < array[right]) {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};

        System.out.println("The rotation point in the array is at index " + findRotationPoint(array));
    }
}

/*
Input:
    int[] array = {3, 4, 5, 1, 2};
Output:
    The rotation point in the array is at index 3
 */