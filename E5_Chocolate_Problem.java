// Given an array of N integers where each value represents the number of chocolates in a packet. 
// Each packet can have a variable number of chocolates. 
// There are m students, the task is to distribute chocolate packets such that: 
// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates 
// given to the students is minimum.
import java.util.*;
public class E5_Chocolate_Problem {
    
    //Creating Function for Chocolate Problem :-
    public static void chocolateProblem(int arr[], int n, int m) {
        //If Students or Packets are 0
        if(m == 0 || n == 0) {
            System.out.println("No Chocolates or Students..!!");
        }
        //If Students count is more than Packets
        if (m > n) {
            System.out.println("Less Packets, can't be distributed..!!");
        }
        //Sort the array
        Arrays.sort(arr);
        // Make Subarrays of size m (Divide array)
        // Find the Minimum diff of Max and Min elements in Subarrays
        // Return the Min of All...!
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            if (arr[i + m - 1] - arr[i] < min) {
                min = arr[i + m - 1] - arr[i];
            }
        }
        System.out.println("Minimum Difference = " + min);
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
        System.out.println("Enter the total number of Students: ");
        int m = sc.nextInt();
        // Calling Function:
        chocolateProblem(arr, n, m);
    }
}
