import java.util.*;
public class E2_Evaluation_of_PostFix_Expression {
    //Function to Evaluate POSTFIX expression
    static int eval(String s) {
        Stack<Integer> stk = new Stack<Integer>();
        
        for(int i = 0; i < s.length(); i++) {
            // If Character is DIGIT
            if(Character.isDigit(s.charAt(i))) {
                //Push inside STACK
                stk.push(s.charAt(i) - '0');
            }    
            else {
                //If Character is Not a Digit 
                //Take out last two digits from Stack and Perform Operation
                int a = stk.pop();
                int b = stk.pop();
                switch(s.charAt(i)) {
                    case '+': stk.push(b + a);
                    break;
                    case '-': stk.push(b - a);
                    break;
                    case '*': stk.push(b * a);
                    break;
                    case '/': stk.push(b / a);
                    break;
                }
            }
        }
        return stk.pop();
    }
    //MAIN Class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression: ");
        String str = sc.nextLine();

        //Function Call
        int ans = eval(str);
        System.out.println("Result = " + ans);
    }
}


