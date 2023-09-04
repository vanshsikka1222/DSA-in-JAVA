// Initiating NODE Class
class Node {
    int data; // Property 1
    Node left; // Property 2
    Node right; // Property 3

    public Node(int data) { // Parameterized Constructor
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Creating class Binary Tree
class BinaryTree2 {
    Node root; // Root
    // Creating a function to INVERT a Binary Tree
    // Function 1
    Node invertTree(Node node) {
        if (node == null) {
            return node;
        }
        Node left = invertTree(node.left);
        Node right = invertTree(node.right);
        // SWAPING Left and Right Nodes
        node.left = right;
        node.right = left;
        return node;
    }
    // Function 2
    // Inorder Traversal to Print Tree and Check wether Inverterd or Not
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    // MAIN CLASS
    public static void main(String[] args) {
        // Creating a TREE as an Object of Class BinaryTree2
        BinaryTree2 tree = new BinaryTree2();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);

        tree.inOrder(tree.root); //40 20 50 10 60 30 70
        System.out.println();
        tree.invertTree(tree.root);
        tree.inOrder(tree.root); //70 30 60 10 50 20 40
    }
} // VANSH SIKKA




