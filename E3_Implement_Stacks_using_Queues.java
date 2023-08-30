import java.util.*;
class Stacks {
    //Implementing Stack using Single Queue
    Queue <Integer> q = new LinkedList <Integer> ();
    //PUSH
    void push(int x) {
        //Get Current Queue Size
        int size = q.size();
        //Push current element
        q.add(x);
        //Pop all prev elements and put them after curr added element
        for(int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }
    //POP
    void pop() {
        //No elements in Queue
        if(q.isEmpty()) {
            return;
        }
        q.remove();
    }
    //TOP (Peek)
    int top() {
        if(q.isEmpty()) {
            return -1;
        }
        return q.peek();
    }
    //SIZE 
    int size() {
        return q.size();
    }
    //Main Class
    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(25);
 
        System.out.println("Current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
 
        System.out.println("Current size: " + s.size());
    }
}

