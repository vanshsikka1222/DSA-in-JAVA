// Step 1: Initiating a NODE Class for Tree
class Node {
    int data; //Prop 1
    Node left; //Prop 2
    Node right; //Prop 3

    Node (int data) { //Parameterized Constructor
        this.data = data;
        // Initiating both left and right subtrees from null.
        this.left = null;
        this.right = null;
    }
}
// Step 2: Initializing Binary TREE Class 
class Binarytrees1 {
    // Intitalizing ROOT Node for Tree
    Node root_t;
    // Initializing ROOT Node for SubTree
    Node root_st;

    // Creating Function to check wether TREE and SUBTREE are IDENTICAL
    boolean identical (Node root_t, Node root_st) {
        // If Both are Null they are Identical
        if (root_t == null && root_st == null) {
            return true;
        }
        // If one of both is Null and other is not means not IDENTICAL
        if (root_t == null || root_st == null) {
            return false;
        }
        // If BOTH are not NULL Compare roots of the Tree and Subtree
        return (root_t.data == root_st.data 
                // COMPARING Left Subtree of TREE and Left Subtree of SUBTREE
                && identical(root_t.left, root_st.left)
                // COMPARING Right Subtree of TREE and Right Subtree of SUBTREE
                && identical(root_t.right, root_st.right));
    }
    // Creating Function to check wether "SUBTREE" is a subtree of "TREE"
    // Tree1 is Main tree
    // Tree2 is the tree to check wether its subtree of Tree1
    boolean check (Node Tree1, Node Tree2) {
        // Base CASE :
        // If Tree2 is Null (Every Null Tree is a Subtree of the TREE)
        if (Tree2 == null) {
            return true;
        }
        // If Tree1 is Null means no subtree is Possible for a Null tree
        if (Tree1 == null) {
            return false;
        }
        // If roots of both trees are equal check for identical 
        // Identical trees are subtrees of each other
        if (identical(Tree1, Tree2)) {
            return true;
        }
        // If roots of both trees are not equal check for Left Side Subtree
        return check(Tree1.left, Tree2) ||
        // If Left Side Subtree is not equal check for Right Side Subtree
        check(Tree1.right, Tree2);
    }

    // MAIN CLASS to form Trees & Call all these functions 
    public static void main(String[] args) {
        Binarytrees1 TREE = new Binarytrees1();
        /* Construct the following MAIN Tree
              70
             /   \
            60    50
           /   \     \
          40    30   20
           \
            10  */
        TREE.root_t = new Node(70);
        TREE.root_t.right = new Node(50);
        TREE.root_t.right.right = new Node(20);
        TREE.root_t.left = new Node(60);
        TREE.root_t.left.left = new Node(40);
        TREE.root_t.left.left.right = new Node(10);
        TREE.root_t.left.right = new Node(30);
        
        // TREE 2 to Check wether SUBTREE
        /* Construct the following tree
           60
         /    \
        40     30
          \
          10  */
 
        TREE.root_st = new Node(60);
        TREE.root_st.right = new Node(30);
        TREE.root_st.left = new Node(40);
        TREE.root_st.left.right = new Node(10);

        //MAIN LOGIC Functions Call
        if (TREE.check(TREE.root_st, TREE.root_t) == true) {
            System.out.println("Tree 2 is a SUBTREE of Tree 1");
        } else {
            System.out.println("Tree 2 is NOT a SUBTREE of Tree 1");
        }
    }
} // VANSH SIKKA



