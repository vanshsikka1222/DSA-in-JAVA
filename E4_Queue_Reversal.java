import java.util.*;
public class E4_Queue_Reversal {
    //Function for Queue Reversal
    static void reverse(Queue <Integer> q) {
        //Adding Queue elements in Stack
        Stack <Integer> stk = new Stack<>();
        while (!q.isEmpty()) {
            stk.push(q.peek());
            q.remove();
        }
        //Adding Back Stack elements back to Queue
        while (!stk.isEmpty()) {
            q.add(stk.peek());
            stk.pop();
        }
    }
 
    //Function to Print Queue
    static void print(Queue <Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
    
    //Main Class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Queue: ");
        int n = sc.nextInt();
        //Entering the Elements in a Queue
        Queue <Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        System.out.println("The REVERSED Queue");
        //Function Call to Reverse a QUEUE
        reverse(q);
        //Function Call to Print a QUEUE
        print(q);
    }
}

