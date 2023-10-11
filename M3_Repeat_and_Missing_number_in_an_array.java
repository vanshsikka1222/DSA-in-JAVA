import java.util.*;
public class M3_Repeat_and_Missing_number_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum_n1 = (n*(n+1))/2;  // SUM of n natural numbers..
        int sum_n2 = (n*(n+1)*((2*n)+1))/6; // SUM of square of n natural numbers..

        int sum_a1 = 0; // SUM of all elements in an array..
        for (int i = 0; i < n; i++) {
            sum_a1 = sum_a1 + arr[i];
        }
        int sum_a2 = 0; // Sum of square of all elements in an array..
        for (int i = 0; i < n; i++) {
            sum_a2 = sum_a2 + (arr[i]*arr[i]);
        }
        int a = sum_a1 - sum_n1; // (x - y)
        int b = sum_a2 - sum_n2; // x^2 - y^2 = (x - y)(x + y)
        if(a == b) {
            System.out.println("No Repeating and Missing Number");
        }
        else {
            int c = b/a; //(x - y)(x + y)/(x - y) = x + y
            int x; //Repeating Number
            x = (c + a)/2;
            int y; //Missing Number
            y = (c - a)/2;
            System.out.println("MISSING Number = " + y);
            System.out.println("REPEATING Number = " + x);
        }
    }
}
