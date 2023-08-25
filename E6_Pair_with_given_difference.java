import java.util.*;
public class E6_Pair_with_given_difference {
    //Creating Function to Find the pair
    public static void pairWithGivenDifference (int arr[] , int n, int key) {
        //USING HASHMAP in JAVA
        HashMap <Integer, Integer> map = new HashMap<>();
        //Adding elements to Map
        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i] , 1);
            }
        }
        //Base Cases
        for(int i = 0; i < n; i++) {
            //Base Cases
            //1. if key = 0 and duplicates are present in array then pair is present 
            if(key == 0 & map.get(arr[i]) > 1) {
                System.out.println("PAIR is: " + arr[i] + " and " + arr[i]);
                break;
            }
            //2. if key = 0 and duplicates are not present in array
            if(key == 0 & map.get(arr[i]) < 1) {
                System.out.println("Pair is NOT Present");
            }
            if(key != 0){
                if(map.containsKey(key + arr[i])) {
                    System.out.println("PAIR is: " + arr[i] + " and " + (key + arr[i]));
                }
                else {
                    System.out.println("Pair is NOT Present");
                }
            }
        }
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
        System.out.println("Enter the Key(Pair Differnce): ");
        int key = sc.nextInt();
        //Calling Function to Search that Pair
        pairWithGivenDifference(arr, n, key);
    }
}
