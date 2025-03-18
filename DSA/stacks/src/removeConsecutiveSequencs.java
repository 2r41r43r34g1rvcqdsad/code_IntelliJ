import java.util.Stack;

public class removeConsecutiveSequencs {
   /* public  static int[] remove(int[] arr){
     int n = arr.length;
     Stack<Integer> st = new Stack<>();
     for(int i =0; i<n;i++){
         if(st.size() ==0 || st.peek()!=arr[i]) st.push(arr[i]);
         else if(arr[i] == st.peek()){
             if(i==n-1 || arr[i] != arr[i+1] ) st.pop();
         }
     }
         int[] res = new int[st.size()];
         int m = res.length;
         for(int i=m-1; i>=0;i--){
             res[i] = st.pop();
         }
         return res;
    }*/
   public static class Main {
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
            int[] res = remove(arr);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }

        public static int[] remove(int[] arr) {
            // Find the length of the array
            int n = arr.length;
            // Create a stack to store the values
            Stack<Integer> st = new Stack<>();
            // Iterate through the whole array
            for (int i = 0; i < n; i++) {
                // Check if the stack is empty or the current element is not equal to the top element of the stack
                if (st.isEmpty() || arr[i] != st.peek()) {
                    st.push(arr[i]);
                }
                // If the current element is equal to the top element of the stack
                else if (arr[i] == st.peek()) {
                    // Skip all consecutive duplicates
                    while (i < n - 1 && arr[i] == arr[i + 1]) {
                        i++;
                    }
                    // Pop the top element from the stack
                    st.pop();
                }
            }
            // Create an array of the size of the current stack
            int[] res = new int[st.size()];
            int m = res.length;
            // Pop elements from the stack and store them in the result array
            for (int i = m - 1; i >= 0; i--) {
                res[i] = st.pop();
            }
            return res;
        }
    }
}
