import java.util.*;
public class E6_Search_in_Rotated_Sorted_Array {
    //1. Find the Pivot Element(Smallest) element in Rotated Array
    //2. PivotedBinary Search
    //Step1 :- Finding Index of PIVOT Element Function
    public static int findPivotElement(int arr[], int low, int high) {
        if (high < low)
            return -1;
        if (high == low)
            return low;
        
        int mid = (low + high) / 2;
        // Condition for Pivot or Minimum Element
        // If number at Mid is Smaller than both its Neighbour elements then it is PIVOT element
        if (arr[mid] < arr[(mid + 1) % arr.length] && arr[mid] < arr[(mid + arr.length - 1) % arr.length])
            return mid;
        // If its not the Case then the PIVOT element is present in UNSORTED part of array
        if (arr[low] >= arr[mid])
        //Means The array portion (low, mid) is UnSorted, Pivot is present in this part, so (high = mid - 1)    
            return findPivotElement(arr, low, mid - 1);
        //Means The array portion (mid, high) is UnSorted, Pivot is present in this part so (low = mid + 1)
        return findPivotElement(arr, mid + 1, high);
    }

    //BINARY SEARCH Function
    public static int binarySearch(int arr[], int low, int high, int key) {
        if(low > high) { //NOT FOUND
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid] == key) {
            return mid;
        }
        if(arr[mid] > key) {
            return binarySearch(arr, low, mid - 1, key);
        }
        return binarySearch(arr, mid + 1, high, key);
    }

    public static int pivotedBinarySearch(int arr[], int n, int key) {
        int pivot = findPivotElement(arr, 0, n - 1);
 
        // If we didn't find a pivot, then array is not Rotated (Perform Normal Binary Search)
        if (pivot == -1) {
            return binarySearch(arr, 0, n - 1, key);
        }
        
        // If we found a pivot, then first compare with pivot and then search in two subarrays around pivot
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot - 1, key);
        return binarySearch(arr, pivot + 1, n - 1, key);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Key to find: ");
        int key = sc.nextInt();
        System.out.println("Index of the element is : " + pivotedBinarySearch(arr, arr.length, key));
    }
}