import java.util.ArrayList;
import java.util.List;

public class spiralMatrix2 {
    // Here we take two pointers: 
    // n represents the number of matrix columns, 
    // and m represents the number of matrix rows.
    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();

        // Edge case: If the matrix is empty or contains no columns
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return ans;
        }

        int m = mat.length;
        int n = mat[0].length;
        int sCol = 0;
        int eCol =n-1;
        int sRow =0;
        int eRow = m-1;
        while(sCol<=eCol && sRow<=eRow){
            // for the top row
            for(int i=sCol;i<=eCol;i++){
                ans.add(mat[sRow][i]);
            }
            // for the right column
            for(int i = sRow+1;i<=eRow;i++){
                ans.add(mat[i][eCol]);
            }
            // for the bottom row
            for(int i =eCol-1;i>=sCol;i--){
                ans.add(mat[eRow][i]);
            }
            for(int i = eRow-1;i>sRow;i--){ // for the left column
                ans.add(mat[i][sCol]);
            }
            // Update boundary pointers after completing one spiral pass
            sCol++;
            eCol--;
            sRow++;
            eRow--;
            
        }
        return ans;
    }

    // Main method to test both odd and even matrix cases
    public static void main(String[] args) {
        int[][] evenMatrix = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
        int[][] oddMatrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Test case: Empty matrix
        int[][] emptyMatrix = {};

        // Test case: Single-row matrix
        int[][] singleRowMatrix = { {1, 2, 3, 4, 5} };

        // Test case: Single-column matrix
        int[][] singleColumnMatrix = { {1}, {2}, {3}, {4}, {5} };

        System.out.println("Spiral Order of Even Matrix: " + spiralOrder(evenMatrix));
        System.out.println("Spiral Order of Odd Matrix: " + spiralOrder(oddMatrix));
        System.out.println("Spiral Order of Empty Matrix: " + spiralOrder(emptyMatrix));
        System.out.println("Spiral Order of Single-Row Matrix: " + spiralOrder(singleRowMatrix));
        System.out.println("Spiral Order of Single-Column Matrix: " + spiralOrder(singleColumnMatrix));
        
                
    }
}
