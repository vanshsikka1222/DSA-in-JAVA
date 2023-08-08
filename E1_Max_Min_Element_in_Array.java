import java.util.Scanner;
public class E1_Max_Min_Element_in_Array {
    
    //Creating Function to Find MIN and MAX Element of an Array
    public static void findMinMaxElement(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MAX Element in Array: " + max);
        System.out.println("MIN Element in Array: " + min);
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
        //Printing the Original Array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Calling Function to Find MIN and MAX Element of Array
        findMinMaxElement(arr, n);
    }
}
