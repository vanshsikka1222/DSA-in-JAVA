import java.util.*;
public class E7_Print_all_Duplicates_in_String {
    
    //Creating Function to Find all Duplicates in String
    public static void printDuplicates(String str) {
        //using HashMaps in Java
        HashMap <Character, Integer> map = new HashMap<>();
        //Key = Character , Value = Integer
        for(int i = 0; i < str.length() - 1; i++) {
            //If Map Already contains the character then update count++
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i) , map.get(str.charAt(i)) + 1);
            }
            else {
                map.put(str.charAt(i) , 1);
            }
        }
        // Now for all keys with pair value greater than 1, Print as Answer
        Set<Character> keys = map.keySet();
        // Loop over all keys and check if all values are > 1 
        for (Character key : keys) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        //Calling Function to print Duplicates
        printDuplicates(str);

    }
}
