// Initiating NODE Class
class Node {
    int data; //Property 1
    Node left; //Property 2
    Node right; //Property 3

    Node (int data) { // Parameterized Constructor
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
// Creating class Binary Tree
class BinaryTree {
    Node root; // Root 
    // Initilising function to calculate MAX Depth
    int max_D (Node node) {
        // If there is only Root Node in Binary Tree
        if (node == null) {
            return 0;
        }
        // If there are children of root node present 
        else {
            // Compute depth of RIGHT Subtree
            int right_D = max_D(node.right);
            // Compute depth of LEFT Subtree
            int left_D = max_D(node.left);
            // USE the LARGER one to conclude results
            // Depth = n + 1; when start initial with 0 index
            if (right_D > left_D) {
                return right_D + 1;
            } 
            else {
                return left_D + 1;
            }
        }
    }
    // MAIN CLASS 
    public static void main(String[] args) {
        // Initialising an object tree using class BinaryTree
        BinaryTree Tree = new BinaryTree();
        // Adding Nodes to it
        Tree.root = new Node(10);
        Tree.root.left = new Node(20);
        Tree.root.right = new Node(30);
        Tree.root.left.left = new Node(40);
        Tree.root.right.right = new Node(50);
        Tree.root.right.right.right = new Node(60);
        // Calling Function to fget Max Depth :-
        System.out.println("The MAX Depth of Binary Tree is: " + Tree.max_D(Tree.root));
        // OUTPUT will be 4
    }
}




