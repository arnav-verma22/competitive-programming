//package Binary Tree;
//import java.util.*;
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
        
        if(root == null || root.right == null && root.left == null)
            return;
        
        if(root.left != null)
        {
            Flatten(root.left, rightLeaf);
            
            Node temp = root.right;
            root.right = root.left;
            root.left = null;

            root.right.right = temp;
            Node t = root.right;
            while(t.right != null)
            {
                t = t.right;
            }
            t.right = temp;


        }
        Flatten(root.right, rightLeaf);
    }
    
    void SubTreeNodesAtK(Node root, int k)
    {
        if(root == null)
            return;
        
        if(k == 0)
        {
            System.out.println(root.data);
            return;
        }

        SubTreeNodesAtK(root.left, k-1);
        SubTreeNodesAtK(root.right, k-1);
        
    }

    int NodesAtk(Node root, Node target, int k)
    {
        if(root == null)
            return -1;
        
        if(root == target)
        {
            SubTreeNodesAtK(root, k);
        }

        int dl = NodesAtk(root.left, target, k);
        if(dl != -1)
        {
            if(dl+1 == k)
            {
                System.out.println(root.data);
                return 0;
            }
            else
            {
                SubTreeNodesAtK(root.left, k-dl-2);
            }
            return dl+1;
        }

        int dr = NodesAtk(root.left, target, k);
        if(dr != -1)
        {
            if(dr+1 == k)
            {
                System.out.println(root.data);
                return 0;
            }
            else
            {
                SubTreeNodesAtK(root.right, k-dr-2);
            }
            return dr+1;
        }
        return -1;
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

        tree.SumReplacement(tree.root);
        tree.printInorder(tree.root);
        Node ca = tree.LCA(tree.root, 5, 4);
        System.out.println("LCA: "+ca.data);

        
    }
}



// import java.util.*;
// class Solution
// {
//     static int max_value(int[] marks, int n)
//     {
//         int max = marks[0];
//         for(int i = 1; i < n; i++)
//         {
//             if(marks[i] > max)
//                 max = marks[i];
//         }
//         return max;
//     }
    
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] marks = new int[n];
        
//         for(int i = 0; i < n; i++)
//         {
//             marks[i] = sc.nextInt();
            
//         }
//         int max = max_value(marks, n);
//         int[] dups = new int[max+n];
//         for(int i = 0; i < n ; i++)
//         {
//             dups[marks[i] - 1]++;
            
//         }
//         for(int i = 0; i < max; i++)
//         {
//             if(dups[i] > 1)
//             {
//                 for(int k =0; k < dups[i] - 1; k++)
//                 {
//                     for(int j = i; j < max; j++)
//                     {
//                         if(dups[j] == 0)
//                         {
//                             dups[i]--;
//                             dups[j]++;
//                         }
//                     }
//                 }
//                 if(dups[i] > 1)
//                 while(dups[i]-- > 1)
//                 {
//                     max++;
//                     dups[max-1]++;
//                 }
//             }
            
//            // System.out.println(dups[i]);
//         }
//         int sum = 0;
//         for(int j = 0; j < max; j++)
//         {
//             System.out.println(dups[j]);
//             sum += j;
//         }
//         System.out.println(sum);
        
        
//     }
// }