import java.util.Arrays;

public class Ques {
    public static void nextPermutation(int[] nums) {
        int a = 0;
        for(int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                a = i;
                break;
            }
        }
        int check = 0;
        int i = 0;
        for(i = nums.length - 1; i >= 0; i--) {
            if(nums[i] > nums[a]) {
                int temp = nums[i];
                nums[i] = nums[a];
                nums[a] = temp;
                check = 1;
                break;
            }
        }
        if (check == 0) {
            Arrays.sort(nums);
        }
        if(check == 1) {
            reverse(nums,a+1,nums.length-1);
        }
    }
    public static void reverse(int[] nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,4,7,5,3,2};
        nextPermutation(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
    

