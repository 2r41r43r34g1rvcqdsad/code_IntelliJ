import java.util.*;

public class spiral_matrics {
    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int m = mat.length;   // Number of rows
        int n = mat[0].length; // Number of columns
        int srow = 0;
        int erow = m - 1;
        int scol = 0;
        int ecol = n - 1;

        while (srow <= erow && scol <= ecol) {

            // top
            for (int j = scol; j <= ecol; j++) {
                ans.add(mat[srow][j]);
            }

            // right
            for (int i = srow + 1; i <= erow; i++) {
                ans.add(mat[i][ecol]);
            }

            //if (srow < erow && scol < ecol) { // Check to avoid double counting
            // bottom
            for (int j = ecol - 1; j >= scol; j--) {
                if(srow==erow) break;
                ans.add(mat[erow][j]);
            }

            // left
            for (int i = erow - 1; i > srow; i--) {
                if(scol==ecol) break;
                ans.add(mat[i][scol]);
            }
            // }

            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int [][]arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(arr));
    }
}
