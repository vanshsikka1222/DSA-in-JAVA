import java.util.*;
public class E4_Contains_Duplicate {
    
    //Creating Function to Find Duplicates in an Array
    public static boolean findDuplicate(int arr[], int n) {
        //Using HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        // Means no Duplicate
        if (set.size() == n) {
            return false;
        }
        // Duplicates were Present
        else {
            return true;
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
        // Calling Function to Find Duplicates in array
        boolean ans = findDuplicate(arr, n);
        System.out.println("Duplicates Present ?? ");
        System.out.println(ans);
    }
}
