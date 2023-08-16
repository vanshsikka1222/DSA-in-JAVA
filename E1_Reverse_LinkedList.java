// Reversing a linked List using ITERATIVE APPROACH
// Creating Class Node
class Node {
    int data; // Property 1
    Node next; // Property 2

    Node (int data) { // Parameterized Constructor
        this.data = data;
        this.next = null;
    }
}
class LinkedList1 {
    // Initialising Head Node
    static Node head;
//----------------------------------------------------------------------------
    //Function to Reverse a Linked List : ITERATIVE Approach
    public void reverse() {
        // Empty List OR List with single Node head
        if (head == null || head.next == null) {
            return;
        }
        // LOGIC to reverse
        Node prev = head; // Initiating 1st Pointer
        Node curr = head.next; // Initiating 2nd Pointer
        while (curr != null) {
            Node forw = curr.next; // Initiating 3rd Pointer
            curr.next = prev; // Reversing by changing address of curr node 

            // Updating both pointers 
            prev = curr;
            curr = forw;
        }
        // Updating new head for our Reversed Linked List 
        head.next = null;
        head = prev;
    }
//-----------------------------------------------------------------------------
    //Method to ADD Node at last
    public void addL(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // Traverse list 
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        // Adding new Node at last..!!
        currNode.next = newNode;
    } 
    //Method to PRINT LinkedList
    public void print(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        // Creating an object (Linked List)
        LinkedList1 list = new LinkedList1();
        // Adding NODES in our list
        list.addL(1);
        list.addL(2);
        list.addL(3);
        list.addL(4);
        list.addL(5);

        System.out.println("The ORIGINAL list: ");
        list.print(head);
        System.out.println();
        System.out.println("The REVERSED list: ");
        list.reverse();
        list.print(head);
    }
}



