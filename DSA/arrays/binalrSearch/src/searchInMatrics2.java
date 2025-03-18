public class searchInMatrics2 {
    public static int[] search(int[][]arr, int target){
        int r = 0;
        int c = arr.length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c]== target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target) r++;
            else c--;
        }
        
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 29;

        int[] result = search(arr, target);
        System.out.println("Target found at: [" + result[0] + ", " + result[1] + "]");
    }
}
