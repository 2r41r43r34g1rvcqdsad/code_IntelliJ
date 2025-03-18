import java.util.ArrayList;

public class linearSerch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        findIndex(arr, target, 0, list);
        System.out.println(list);

    }

    // here we re returning a array list so the funcution should be returnd as arrayList
    public  static ArrayList<Integer> findIndex(int[] arr , int target, int index, ArrayList<Integer> list){
        if(arr.length == index){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findIndex(arr, target, index+1, list);
    }



}
