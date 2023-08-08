import java.util.Scanner;
public class E3_Maximum_Subarray_Sum {
    
    //Creating a Function to find Maximum Saubarray Sum
    public static int maxSubarraySum(int arr[], int n) {
        // Using KADANE'S Algorithm
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("MAX SUBARRAY Sum: ");
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Elements in Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The ORIGINAL ARRAY: ");
        //Printing the Original Array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Calling Function to Find Maximum Sum Subarray
        int ans = maxSubarraySum(arr, n);
        System.out.println(ans);
    }
}
