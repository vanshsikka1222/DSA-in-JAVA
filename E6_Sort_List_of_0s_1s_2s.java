import java.util.HashMap;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList6 {
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
    //Function to Sort 0s 1s and 2s in Linkedlist
    public void sort() {
        //Using HashMap
        HashMap <Integer, Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null) {
            if(map.containsKey(temp.data)) {
                map.put(temp.data, map.get(temp.data) + 1);
                temp = temp.next;
            }
            else {
                map.put(temp.data , 1);
                temp = temp.next;
            }
        }
        temp = head;
        while (temp != null) {
            if(map.get(0) > 0) {
                temp.data = 0;
                map.put(0 , map.get(0) - 1);
                temp = temp.next;
            }
            else if(map.get(1) > 0) {
                temp.data = 1;
                map.put(1 , map.get(1) - 1);
                temp = temp.next;
            }
            else if(map.get(2) > 0) {
                temp.data = 2;
                map.put(2 , map.get(2) - 1);
                temp = temp.next;
            }
        }
    }
}
//--------------------------------------------------------------------------
public class E6_Sort_List_of_0s_1s_2s {
    public static void main(String[] args) {
        LinkedList6 list = new LinkedList6();
        list.addL(1);
        list.addL(2);
        list.addL(1);
        list.addL(0);
        list.addL(0);
        list.addL(2);
        list.addL(1);
        //1->2->1->0->0->2->1
        
        System.out.println("ORIGINAL LIST:");
        list.print();
        System.out.println("SORTED LIST:");
        list.sort();
        list.print();
    }
}
