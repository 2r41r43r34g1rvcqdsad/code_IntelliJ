import java.util.Arrays;

public class searchInMatrics {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 14;

        // Uncomment the desired method to test
        // Using the linear search method
        // System.out.println(Arrays.toString(search(arr, target)));

        // Using the middle-element-based method
        System.out.println(Arrays.toString(SearchIn2DMatrix.search2(arr, target)));
    }

    // Method 1: Linear search in sorted 2D matrix
//    static int[] search(int[][] matrix, int target) {
//        int r = 0;
//        int c = matrix[0].length - 1; // Start from top-right corner
//        while (r < matrix.length && c >= 0) {
//            if (matrix[r][c] == target) {
//                return new int[]{r, c};
//            }
//            if (matrix[r][c] < target) {
//                r++; // Move down to the next row
//            } else {
//                c--; // Move left in the current row
//            }
//        }
//        return new int[]{-1, -1}; // Target not found
//    }

    // Method 2: Search by narrowing down rows and using binary search
    static class SearchIn2DMatrix {

        static int[] search2(int arr[][], int target) {
            int row = arr.length;
            int col = arr[0].length;

            if (row == 1) {
                return binarySearch(arr, 0, 0, col - 1, target);
            }

            int rStart = 0;
            int rEnd = row - 1;
            int cMid = col / 2;

            // Narrowing down to 2 rows
            while (rStart < (rEnd - 1)) { // More than 2 rows remaining
                int mid = rStart + (rEnd - rStart) / 2;
                if (arr[mid][cMid] == target) {
                    return new int[]{mid, cMid};
                }
                if (arr[mid][cMid] < target) {
                    rStart = mid; // Eliminate upper rows
                } else {
                    rEnd = mid; // Eliminate lower rows
                }
            }

            // Check in the middle column of the 2 narrowed rows
            if (arr[rStart][cMid] == target) {
                return new int[]{rStart, cMid};
            }
            if (arr[rStart + 1][cMid] == target) {
                return new int[]{rStart + 1, cMid};
            }

            // Search in four halves
            // First half
            if (target <= arr[rStart][cMid - 1]) {
                return binarySearch(arr, rStart, 0, cMid - 1, target);
            }
            // Second half
            if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][col - 1]) {
                return binarySearch(arr, rStart, cMid + 1, col - 1, target);
            }
            // Third half
            if (target <= arr[rStart + 1][cMid - 1]) {
                return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
            }
            // Fourth half
            if (target >= arr[rStart + 1][cMid + 1]) {
                return binarySearch(arr, rStart + 1, cMid + 1, col - 1, target);
            }

            // If target is not found
            return new int[]{-1, -1};
        }

        // Binary search in a row
        static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
            while (cStart <= cEnd) {
                int mid = cStart + (cEnd - cStart) / 2;
                if (arr[row][mid] == target) {
                    return new int[]{row, mid};
                }
                if (arr[row][mid] < target) {
                    cStart = mid + 1;
                } else {
                    cEnd = mid - 1;
                }
            }
            return new int[]{-1, -1};
        }
    }
}
