import java.util.*;
public class E2_Valid_Anagram {
    
    //BruteForce = Sort both string (Character Arrays) and compare every character
    //Creating Function to Find is String Anagram or Not
    public static boolean isAnagram(String str1, String str2) {
        //If both or anyone String is null (BASE CASE)
        if(str1 == null || str2 == null) {
            return false;
        }
        //Length of Strings are Not Same (BASE CASE)
        if(str1.length() != str2.length()) {
            return false;
        }
        //Initiating HashMaps in JAVA (Key, Value) Pair
        //Character of str1 = KEY, Number of Count of each Chracter = VALUE
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            //If map already contains the character key increase the count value by 1
            if(map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            }
            //Else map doesn't contains the character key, its the First Occurence
            //Set the Counter = 1(VALUE)
            else {
                map.put(str1.charAt(i), 1);
            }
        }
        //Now LOOP over str2 and will reduce counter as the character key comes in way
        //If at Last all values are ZEROES means its an ANAGRAM, else Not ANAGRAM
        for (int i = 0; i < str2.length(); i++) {
            //If map already contains the character key decrease the count value by 1
            if(map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i) , map.get(str2.charAt(i)) - 1);
            }
            //If Character is Not Present then simply Return FALSE (Not Anagram)
            else {
                return false;
            }
        }
        // Extract all keys of HashMap
        Set<Character> keys = map.keySet();
        // Loop over all keys and check if all keys are 0.
        // If so it means it is anagram.
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        // Returning True as all keys are zero
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to Check Anagram or Not");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        //Function call
        boolean ans = isAnagram(str1, str2);
        System.out.println(ans);
    }
}
