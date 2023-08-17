//Merge two sorted linkedLists
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListE3 {
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
}
//------------------------------------------------------------------------------------
class Merge {
    //Function to Merge two Sorted Lists
    public Node merge(Node list1, Node list2) {
        //Creating New Linkedlist
        Node ans = new Node(0);
        Node curr = ans;
        
        while(true) {
            if(list1 == null) {
                curr.next = list2;
                break;
            }
            if(list2 == null) {
                curr.next = list1;
                break;
            }
            //Comparing nodes in both lists and adding acc
            if (list1.data >= list2.data) {
                curr.next = list2;
                list2 = list2.next;
            }
            else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }
        return ans.next;
    }
}
//------------------------------------------------------------------------------------
public class E3_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
    LinkedListE3 list1 = new LinkedListE3();
    list1.addF(6);
    list1.addF(4);
    list1.addF(2);
    //2 -> 4 -> 6
    LinkedListE3 list2 = new LinkedListE3();
    list2.addF(5);
    list2.addF(3);
    list2.addF(2);
    list2.addF(1);
    //1 -> 2 -> 3 -> 5
    System.out.println("ORIGINAL LISTS:");
    list1.print();
    System.out.println();
    list2.print();
    System.out.println();
    System.out.println("MERGED LIST");
    list1.head = new Merge().merge(list1.head, list2.head);
    list1.print();
    }
}


