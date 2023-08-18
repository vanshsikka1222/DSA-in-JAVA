import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListE5 {
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
//---------------------------------------------------------------------
    //Creating Function to remove duplicates from list
    public void removeduplicates(Node node) {
        //Using HASHING
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while(curr != null) {
            int val = curr.data;
            //if set already contains data of node
            if(set.contains(val)) {
                //SKIP Node (Remove)
                prev.next = curr.next;
            }
            //if set encounters a new value not present before
            else {
                set.add(val);
                prev = curr;
            }
            curr = curr.next;
        }
    }
}
//---------------------------------------------------------------------
public class E5_Remove_duplicates_from_Unsorted_List {
    public static void main(String[] args) {
        LinkedListE5 list = new LinkedListE5();
        list.addF(9);
        list.addF(3);
        list.addF(6);
        list.addF(2);
        list.addF(10);
        list.addF(9);
        list.addF(6);
        //6->9->10->2->6->3->9
        System.out.println("ORIGINAL LIST:");
        list.print();
        System.out.println("REMOVED DUPLICATES (New List):");
        list.removeduplicates(list.head);
        list.print();

    }
}