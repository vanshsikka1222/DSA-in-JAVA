import java.util.*;
public class E4_Searching_in_array_where_adjaent_differ_by_atmost_k {
    
    //Creating Function to SEARCH element in Array:
    public static int search(int arr[], int s, int k) {
        int n = arr.length;
        int i = 0;
        while(i < n) {
            if(arr[i] == s) {
                return i;
            }
            i = i + Math.max(1 , Math.abs(arr[i] - s)/k);
        }
        System.out.println("Number is Not PRESENT");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter value of atmost difference between adjacent array elements (k):");
        int k = sc.nextInt();
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to SEARCH: ");
        int s = sc.nextInt();
        //Function call to Search element:
        int ans = search(arr, s, k);
        System.out.println("Element " + s + " is Present at Index " + ans);
    }
}




