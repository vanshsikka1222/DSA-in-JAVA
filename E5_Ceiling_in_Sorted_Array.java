import java.util.*;
public class E5_Ceiling_in_Sorted_Array {
    
    //Creating FUNCTION to Find Floor and Ceil
    public static int binarySearch(int arr[], int k) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == k) {
                return mid;
            }
            if(arr[mid] > k) {
                high = mid - 1;
            }
            if(arr[mid] < k) {
                low = mid + 1;
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Key to Find FLOOR and CEIL: ");
        int k = sc.nextInt();
        // Calling Function to Find Ceil and Floor
        int index = binarySearch(arr, k);
        if(index != -1 ) {
            System.out.println("CEIL = " + arr[index + 1]);
            System.out.println("FLOOR = " + arr[index - 1] );
        }
        if(index == arr.length - 1) {
            System.out.println("NO CEIL is present");
            System.out.println("FLOOR = " + arr[index - 1]);
        }
        if(index == 0) {
            System.out.println("CEIL = " + arr[index + 1]);
            System.out.println("NO FLOOR is present");
        }
    }
}
