import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        Solution s = new Solution();
        Solution2 u = new Solution2();

        int[] nums = {1, 2, 1, 1, 2, 1, 5, 32, 4, 2, 5};
        Arrays.sort(nums);
        int t=s.removeDuplicates(nums);
        System.out.println("Unique elements:");
        for (int i = 0; i < t; i++) {
            System.out.println(nums[i]);
        }

        int y= u.removeDuplicates(nums);
        System.out.println("Unique elements:");
        for (int i = 0; i < y; i++) {
            System.out.println(nums[i]);
        }


    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i =1; i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;}}
        return j;}
}

class Solution2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length; // early exit for the small arrays
        int j=2;  // starting with the 2nd index
        for( int i =2; i<nums.length;i++){
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}