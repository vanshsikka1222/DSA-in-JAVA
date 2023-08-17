//Delete without Head Node
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListE4 {
    Node head;
    //Add at First
    public void addF(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //Print List
    public void print() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("NULL");
    }
//----------------------------------------------------------------
    //Function to DELETE NODE without HEAD Node
    public void deleteWithoutHead(Node ptr) {
        //ptr is the Pointer Pointing the Node to Delete
        // Node temp is the Node next to the Node to Delete
        Node temp = ptr.next;
        // Copying the DATA of temp node to ptr
        ptr.data = temp.data;
        // Changing Address of ptr to point the Next Node
        ptr.next = temp.next;
    }
}
//-----------------------------------------------------------------
public class E4_Delete_Without_Head_Node {
    public static void main(String[] args) {
        LinkedListE4 list = new LinkedListE4();
        list.addF(6);
        list.addF(5);
        list.addF(4);
        list.addF(3);
        list.addF(2);
        list.addF(1);
        System.out.println("ORIGINAL LIST: ");
        list.print();
        System.out.println();
        System.out.println("After DELETING without using HEAD NODE:");
        list.deleteWithoutHead(list.head.next);
        list.print();
    }
}