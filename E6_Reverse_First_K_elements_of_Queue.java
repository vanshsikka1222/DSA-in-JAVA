import java.util.*;
public class E6_Reverse_First_K_elements_of_Queue {
    //Function to Reverse First K elements of Queue 
    static void reverse(Queue <Integer> q, int k) {
        if (q.isEmpty() == true || k > q.size() || k <=0) {
            //Edge Cases
            return;
        } 
        //Creating STACK
        Stack <Integer> s = new Stack<>();
        //Push first 'k' elements in STACK
        for (int i = 0; i < k; i++) {
            s.push(q.peek());
            q.remove();
        }

        //Enqueue contents of STACK back to Queue from Back (Rear End)
        while (!s.empty()) {
            q.add(s.peek());
            s.pop();
        }

        //Remove 'N-k' elements from queue and add them at back
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.peek());
            q.remove();
        }
    }
    //Function for Printing QUEUE
    static void Print(Queue <Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
    
    //MAIN CLASS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of QUEUE: ");
        int n = sc.nextInt();
        System.out.println("Input Queue Elements");
        Queue <Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        System.out.println("Enter value of K: ");
        int k = sc.nextInt();
        System.out.println("Queue after reversing first K elements: ");
        //FUNCTION CALL
        reverse(q, k);
        Print(q);

    }
}
