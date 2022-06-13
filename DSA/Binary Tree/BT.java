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


    void Flatten(Node root, Node rightLeaf)
    {
        
        if(root == null)
            return;
        
        
        Flatten(root.left, rightLeaf);

        if(root.right == null && root.left == null)
            return;
        
        Node temp = root.right;
        root.right = root.left;
        root.right.right = temp;

        Flatten(root.right, rightLeaf);
        if(root.right == null && root.left == null)
        {
            rightLeaf = root;
            return;
        }
    }
    
    Node LCA(Node root, int n1, int n2)
    {
        if(root == null)
            return null;
        
        if(root.data == n1 || root.data == n2)
            return root;
        
        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);

        if(left != null && right != null)
            return root;
        if(left != null)
            return LCA(root.left, n1, n2);

        if(right != null)
            return LCA(root.right, n1, n2);
        
        
        return null;
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

        //tree.SumReplacement(tree.root);
        tree.printInorder(tree.root);
        Node ca = tree.LCA(tree.root, 5, 4);
        System.out.println("LCA: "+ca.data);
        
    }
}
