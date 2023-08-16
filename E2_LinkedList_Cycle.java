//LinkedList Cycle Detection
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class E2_LinkedList_Cycle {
    Node head;
//----------------------------------------------------------------------
    //Creating Function to detect Cycle in a Linkedlist
    public boolean detectCycle() {
        if(head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }    
        return false;    
    }
//----------------------------------------------------------------------
    //Function to add at last in list
    public void addL(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    //Function to Print LinkedList
    public void print() {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        //Creating a LinkedList object
        E2_LinkedList_Cycle list = new E2_LinkedList_Cycle();
        //Adding elements using Class Method
        list.addL(1);
        list.addL(2);
        list.addL(3);
        list.addL(4);
        list.addL(5);
        list.addL(6);
        // Just to check wether right or wrong
        // Creating loop for test
        list.head.next.next.next.next.next.next = list.head;
        boolean ans = list.detectCycle();
        System.out.println(ans);
    }
}

