// Creating Node class
class Node {
    int data; //Prop 1
    Node left; //Prop 2
    Node right; //Prop 3

    Node (int data) { // Parameterized Constructor
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
// Creating BinaryTree class
class BinaryTrees {
    // Initialising Root Node
    Node root;
    // Step 1 = Find the Height of the Given Tree
    // Step 2 = Print Function to print Nodes at given Level
    // Step 3 = For loop using above two for reverse order traversal
    // Step 4 = Creating MAIN CLASS and call all of them
    
    // 1. Function to find the Height of a Tree 
    int height (Node node) {
        // If Tree is Empty
        if (node == null) {
            return 0;
        }
        // If Tree has Children and Subtrees of its Own
        else {
            // Height of Left Subtree
            int left_h = height(node.left);
            // Height of Right Subtree
            int right_h = height(node.right);

            // Computing which one is Larger and getting result 
            if (left_h > right_h) {
                return (left_h + 1);
            }
            else {
                return (right_h + 1);
            }
        }
    }
    
    // 2. Function for Printing Nodes at every Level
    void print (Node node, int level) {
        // If there is no Node in a Tree
        if (node == null) {
            return;
        }
        // If there is only Root Node in a Tree 
        if (level == 1) {
            System.out.print((node.data + " "));
        }
        // If there are children (Left and Right subtrees)
        else if (level > 1) {
            // Recursive call
            // for Left subtree
            print(node.left, level - 1);
            // for Right subtree
            print(node.right, level - 1 );
        }
    }

    // 3. Loop to execute Reverse Order Traversal
    void reverse (Node node) {
        // Height of tree
        // Calling height function
        int h = height(node);
        // Loop
        for (int i = h; i >= 1; i--) {
            // Calling print Function
            print( node, i); // Node, Level
        }
    }

    // Step 4 : Main Class
    public static void main(String[] args) {
        // Creating an Object Tree of class Binary Tree
        BinaryTrees tree = new BinaryTrees();
        // Creating tree (adding Nodes to it) 
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.right.right = new Node(50);
        tree.root.right.right.right = new Node(60);

        System.out.println("reverse level order Traversal: ");
        tree.reverse(tree.root);
        //OUTPUT : 60,50,40,30,20,10
    }
} // -Vansh Sikka










