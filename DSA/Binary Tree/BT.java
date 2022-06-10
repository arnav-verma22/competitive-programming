//package Binary Tree;

class Node {
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class BT {
    
    Node root;
    BT() 
    { 
        root = null; 
    }

    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.data + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }


    int SumReplacement(Node root)
    {
        if(root.left == null && root.right == null)
            return root.data;
        
        root.data += SumReplacement(root.left) + SumReplacement(root.right) ;
        return root.data;
    }
    public static void main(String[] args) {
        BT tree = new BT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.SumReplacement(tree.root);
        tree.printInorder(tree.root);
        
    }
}
