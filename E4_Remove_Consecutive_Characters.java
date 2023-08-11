import java.util.*;
public class E4_Remove_Consecutive_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sentence: ");
        // INPUT sentence from USER :
        String str1 = sc.nextLine();
        // StringBuilder to store the final result..!!
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                // If consecutive characters are equal continue
                continue;
            } else {
                // Add the character to stringbuilder (Append)
                sb.append(str1.charAt(i));
            }
        }
        // Appending the last character of string 
        sb.append(str1.charAt(str1.length() - 1));
        // Printing Stringbuilder FINAL RESULT
        System.out.println(sb);
    }
}
