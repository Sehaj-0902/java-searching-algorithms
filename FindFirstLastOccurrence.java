public class FindFirstLastOccurrence {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 7, 8, 10};
        int target = 8;

        int firstOccurrence = findFirst(array, target);
        int lastOccurrence = findLast(array, target);

        System.out.println("First and last occurrence of " + target + " is at index " + firstOccurrence + " and " + lastOccurrence);
    }

    // Method to find first occurrence of target
    private static int findFirst(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                right = mid - 1;
            }
            else if (array[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Method to find last occurrence of target
    private static int findLast(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}

/*
Input:
    int[] array = {5, 7, 8, 7, 8, 10};
    int target = 8;
Output:
    First and last occurrence of 8 is at index 2 and 4
*/