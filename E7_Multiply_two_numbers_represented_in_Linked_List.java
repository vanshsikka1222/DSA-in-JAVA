class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList7 {
    Node head;
    public void addL(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
//--------------------------------------------------------------------------
    //Function to Multiply two numbers represented in Linked List
    //Step 1: Extracting number from linkedlist eg : list = 1->2->5 : Number = 125
    public int extractNumber() {
        Node temp = head;
        int value = 0;
        while(temp != null) {
            value = (10*value) + temp.data;
            temp = temp.next;
        }
        return value;
    }
}
//--------------------------------------------------------------------------
public class E7_Multiply_two_numbers_represented_in_Linked_List {
    public static void main(String[] args) {
        LinkedList7 list1 = new LinkedList7();
        list1.addL(1);
        list1.addL(3);
        list1.addL(5);
        //1->3->5 :- 135
        LinkedList7 list2 = new LinkedList7();
        list2.addL(2);
        list2.addL(4);
        //2->4 :- 24
        System.out.println("LinkedLists: ");
        list1.print();
        list2.print();
        System.out.println("MULTIPLICATION of TWO Numbers Represented by Lists are: ");
        int n1 = list1.extractNumber();
        int n2 = list2.extractNumber();
        System.out.println(n1 + " and " + n2);
        int ans = n1*n2;
        System.out.println("Final Answer after Multiplication: " + ans);
    }
}
