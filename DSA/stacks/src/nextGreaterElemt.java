public class nextGreaterElemt {

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 3, 5, 7, 8, 4, 3};
            int[] res = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                res[i] = -1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        res[i] = arr[j];
                        break;
                    }
                }
            }

            System.out.println("Original array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("Next greater elements array: ");
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }


