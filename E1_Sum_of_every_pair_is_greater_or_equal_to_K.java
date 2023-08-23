import java.util.*;
public class E1_Sum_of_every_pair_is_greater_or_equal_to_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking 2 arrays of same size as Input
        System.out.println("Enter Size of Arrays..!!");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter elements of array1: ");
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of array2: ");
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("ARRAY 1:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("ARRAY 2:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the value of K :");
        int k = sc.nextInt();

        //------------------------------------------------------------------
        //Sorting the Arrays :- One is Ascending and other in Descending Order
        Arrays.sort(arr1); //Array1 in ASCENDING
        Arrays.sort(arr2); //Array2 in ASCENDING
        //Array2 now in DESCENDING order...!!
        Collections.reverse(Arrays.asList(arr2));

        //Now Main Logic
        int flag = 0;
        for(int i = 0; i < n; i++) {
            if(arr1[i] + arr2[i] >= k) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}









