//Class to Implement twoStacks
    class twoStacks {
    int arr[];
    int size;
    int top1, top2;
  
    // Constructor
    twoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = n/2 + 1;
        top2 = n/2;
    }
    //Method to PUSH an element x to Stack1
        void push1(int x) {
            if(top1 > 0) {
                top1 = top1 -1;
                arr[top1] = x;
            }
            else {
                System.out.println("Stack1 OverFlow by element: " + x);
                return;
            }
        }
    
    //Method to PUSH element x to Stack2
        void push2(int x) {
            if(top2 < size - 1) {
                top2 = top2 + 1;
                arr[top2] = x;
            }
            else {
                System.out.println("Stack2 OverFlow by element: " + x);
                return;
            }
        }
    
    //Method to pop an element from Stack1
        void pop1() {
            if(top1 <= size/2) {
                int x = arr[top1];
                top1 = top1 + 1;
                System.out.println(x);
            }
            else {
                System.out.println("Stack UnderFlow");
                System.exit(1);
            }
        }

    //Method to pop an element from Stack2 
        void pop2() {
            if (top2 >= size/2 + 1) {
                int x = arr[top2];
                top2--;
                System.out.println(x);
            }
            else {
                System.out.print("Stack UnderFlow");
                System.exit(1);
            }
        }
    //Main Class
    public static void main(String[] args) {
        twoStacks s = new twoStacks(5);
        s.push1(5);
        s.push2(1);
        s.push2(2);
        s.push1(10);
        s.push2(3);
        System.out.println("Poped Element from Stack1 is: ");
        s.pop1();
        System.out.println("Poped Element from Stack2 is: ");
        s.pop2();
    }
} 

