public class majorityElement {
    public static void main(String[] args) {
        Majority m = new Majority();
        int[] num = {3,2,3};
        int e = m.majorityElement(num);
        System.out.println(e);
    }
}

class Majority {
    public int majorityElement(int[] nums) {
        int count=0;
        int count2 =0;

        for(int num:nums){
            if(count==0){
                count2=num;
            }
            if(num==count2){
                count++;
            }
            else count--;
        }
        return count2;


    }
}
