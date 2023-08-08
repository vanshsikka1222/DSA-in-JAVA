import java.util.Scanner;
public class E2_Reverse_Array {
    
    //Creating Function to Reverse an Array
    public static void reverse(int arr[], int n) {
        int ans[] = new int[n];
        int k = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[k] = arr[i];
            k++; 
        }
        System.out.println("The REVERSED Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
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
        //Calling Function to Reverse an Array
        reverse(arr, n);
    }
}
