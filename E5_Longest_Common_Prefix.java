import java.util.*;
public class E5_Longest_Common_Prefix {
    
    // Creating Function to Check LONGEST COMMON PREFIX
    public static String longestCommonPrefix(String[] str) {
        //Base Case
        if(str.length == 0) {
            return "";
        }
        //If not Step1 : Sort the Array and Compare the FIRST and LAST String
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int n = 0;
        while (n < first.length()) {
            if (first.charAt(n) == last.charAt(n)) {
                n++;
            }
            else {
                break;
            }
        }
        if(n > 0) {
            return first.substring(0, n);
        }
        else {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array of Strings: ");
        int n = sc.nextInt();
        String str[] = new String[n];

        System.out.println("Enter Strings to check: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        //Calling Function to Find Longest Common Prefix
        String ans = longestCommonPrefix(str);
        System.out.println("Longest Common Prefix is: ");
        System.out.println(ans);
    }
}
