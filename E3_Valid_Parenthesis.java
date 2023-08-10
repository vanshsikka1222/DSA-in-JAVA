import java.util.*;
public class E3_Valid_Parenthesis {
    
    //Creating Function to check Valid Parenthesis or not
    public static boolean validParenthesis(String str) {
        //USING Character STACK
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                s.push(')');
            }
            else if (str.charAt(i) == '{') {
                s.push('}');
            }
            else if (str.charAt(i) == '[') {
                s.push(']');
            }
            else if (s.isEmpty() || s.pop() != str.charAt(i)) {
                return false;
            }   
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parenthesis to check Valid Parenthesis or not..!!");
        String str = sc.nextLine();
        //Calling Function to Check Valid Parenthesis
        boolean ans = validParenthesis(str);
        System.out.println(ans);
    }
}
