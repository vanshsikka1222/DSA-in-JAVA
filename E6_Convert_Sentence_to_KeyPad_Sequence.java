import java.util.*;
public class E6_Convert_Sentence_to_KeyPad_Sequence {
    
    //Creating Function for this CONVERSION
    public static void conversion(String str) {
        // Storing the Sequence in array
        String str1[] = { 
        "2", "22", "222", //A=2, B=22, C=222
        "3", "33", "333",
        "4", "44", "444",
        "5", "55", "555",
        "6", "66", "666", 
        "7", "77", "777","7777", //P=7, Q=77, R=777, S=7777
        "8", "88", "888", 
        "9", "99","999", "9999" };

        // LOGIC to perform the Conversion :-
        String answer = ""; // To Store the Output Final answer after conversion
        for (int i = 0; i < str.length(); i++) {
            // If String contains SPACE in it..!!
            if (str.charAt(i) == ' ') {
                answer += "0";
            }
            else {
                // Finding the original position of Character in Order
                int pos = str.charAt(i) - 'A'; //ASCII value of 'A' is 65
                answer += str1[pos];
            }
        }
        System.out.println("The Numeric Keypad Conversion of " + str + " is: ");
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to convert..!! ");
        System.out.println("Enter in Capital (UPPERCASE): ");
        // Taking String input from user (Word to convert)
        String str = sc.nextLine();
        //Function Call
        conversion(str);
    }
} 




