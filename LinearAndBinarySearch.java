import java.util.Arrays;

public class LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] numsArray = {1, 2, 0, 4, 7, 5};
        System.out.println("Missing positive number in array: " + findFirstMissingPositive(numsArray));

        int target = 7;
        System.out.println("Index of " + target + " in sorted array: " + binarySearch(numsArray, target));
    }

    // Method to find first missing positive number in array
    public static int findFirstMissingPositive(int[] numsArray) {
        int n = numsArray.length;
        boolean[] present = new boolean[n + 1];

        for (int num : numsArray) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }

    // Method to perform binary search to find index of target
    public static int binarySearch(int[] numsArray, int target) {
        Arrays.sort(numsArray);

        int left = 0;
        int right = numsArray.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (numsArray[mid] == target) {
                return mid;
            }
            else if (numsArray[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

/*
Input:
    int[] numsArray = {1, 2, 0, 4, 7, 5};
    int target = 7;
Output:
    Missing positive number in array: 3
    Index of 7 in sorted array: 5
 */