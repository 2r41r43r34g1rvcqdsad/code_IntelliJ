import java.util.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            sumLeftToRight += arr.get(i).get(i);
            sumRightToLeft += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(sumLeftToRight - sumRightToLeft);
    }
}

public class Digonal_Difference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(11, 2, 4));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(10, 8, -12));

        int result = Result.diagonalDifference(arr);

        System.out.println("The diagonal difference is: " + result);
    }
}
