//package linkedlist;
import java.util.*;
//import Node;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
public class reversek {


    static Node ReverseK2(Node head, int k)
    {
        Node prev = null;
        Node curr = head;
        Node ahead = curr.next;
        int count = 0;
        while(curr.next != null && count<k)
        {
            
            curr.next = prev;
            prev = curr;
            curr = ahead;
            ahead = curr.next;
            count++;
        }

        if(ahead != null)
        {
            head.next = ReverseK(curr, k);
        }
        return prev;

    }

    static Node ReverseK(Node head, int k)
    {
        Node prev = null;
        Node curr = head, ahead = null;
        int count = 0;
        while(curr != null && count<k)
        {
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
            count++;
        }

        if(ahead != null)
        {
            head.next = ReverseK(ahead, k);
        }
        return prev;

    }

    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            
            Node res = ReverseK2(head, k);
            printList(res);
            System.out.println();
        }
    }
}
