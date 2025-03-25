public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 4, 7},
                {9, 12, 16, 20},
                {22, 30, 34, 60}
        };
        int target = 12;

        if (findTarget(matrix, target)) {
            System.out.println("Target found in the matrix.");
        }
        else {
            System.out.println("Target not found in the matrix.");
        }
    }

    // Method to find target value
    public static boolean findTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        // Performing binary search to find target value
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}

/*
Input:
    int[][] matrix = {
        {1, 3, 4, 7},
        {9, 12, 16, 20},
        {22, 30, 34, 60}
    };
    int target = 12;
Output:
    Target found in the matrix.
 */