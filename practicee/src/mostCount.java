import java.util.Arrays;

public class mostCount {
    public static void main(String[] args) {
        mostCount m = new mostCount();
        int num[]= {3,2,3,4,4,5,5,5,6,6,6,6,6};
        int n = m.majority(num);
        System.out.println(n);

    }

    public  int majority(int[] num){
        Arrays.sort(num);
        int n = num.length;
        return num[n/2];
    }

}
