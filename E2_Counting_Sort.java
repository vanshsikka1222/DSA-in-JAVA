//COUNTING SORT :- Non-Comparison Based Algo
//Given :- Input array Size and specific range of array elements
import java.util.*;
public class E2_Counting_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array to Sort: ");
        int n = sc.nextInt();
        System.out.println("Enter the RANGE element(Highest element in array): ");
        int k = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The ORIGINAL ARRAY:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //COUNTING SORT
        //Creating new Array of Size : Range element(Highest element in array) : k + 1
        int count[] = new int[k + 1];
        //Set all elements of 'a' array to 0 initially
        for(int i = 0; i < k + 1; i++) {
            count[i] = 0;
        }
        //Traversing the input array and Storing the COUNT of every element at index in 'count' array
        for(int i = 0; i < n; i++) {
            count[arr[i]] = count[arr[i]] + 1;
        }
        //Count array
        System.out.println("COUNT ARRAY: ");
        for(int i = 0; i < k + 1; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();

        //Now Use Count array to SORT the Original Array:-
        int ans[] = new int[n]; //ANSWER array (Sorted).
        int a = 0;
        for(int i = 0; i < k + 1; i++) {
            while(count[i] > 0) {
                ans[a] = i;
                a++;
                count[i] = count[i] - 1;
            }
        }
        System.out.println("The SORTED array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
// Can Also perform using HASHMAPs (Logic should be of COUNTING Sort only)...!!


