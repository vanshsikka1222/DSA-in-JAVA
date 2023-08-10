import java.util.*;
public class E1_Valid_Palindrome {

    //Creating Function to check Valid Palindrome
    public static boolean checkPalindrome(String s) {
        String s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^a-zA-Z0-9]" , "" );

        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        // Converting StringBuilder back to String
        String rs = sb.toString();

        boolean flag = false;
        if (s1.equals(rs)) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check PALINDROME or not..!!");
        String str = sc.nextLine();
        //Calling Function to Check Palindrome 
        boolean ans = checkPalindrome(str);
        System.out.println(ans);
    }
}
