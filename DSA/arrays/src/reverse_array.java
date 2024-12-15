public class reverse_array {
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Changed to print instead of println for better formatting
        }
        System.out.println();
    }

    public static void main(String[] args) {
        reverse_array r = new reverse_array();  // Create an instance of reverse_array
        int[] numbers = {3, 5, 2, 5, 6, 8, 9, 7};
        r.printArray(numbers);                  // Call the instance method
        r.reverse(numbers, 0, numbers.length - 1); // Call the instance method
        r.printArray(numbers);                  // Print reversed array
    }
}
