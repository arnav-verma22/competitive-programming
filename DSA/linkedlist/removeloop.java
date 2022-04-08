//package linkedlist;
import java.util.*;

class Node
{
    int data;
    Node next;
}
public class removeloop {

    public static int length(Node head){
        int ret=0;
        while(head!=null)
        {
            ret += 1;
            head = head.next;
        }
        return ret;
    }
    public static Node newNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }
    
    public static void makeLoop(Node head, int x){
        if (x == 0)
            return;
        Node curr = head;
        Node last = head;

        int currentPosition = 1;
        while (currentPosition < x)
        {
            curr = curr.next;
            currentPosition++;
        }
        
        while (last.next != null)
            last = last.next;
        last.next = curr;
    }
    public static boolean detectLoop(Node head)
    {
        Node fast = head;
        Node slow = head;
        
        while (fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            //System.out.print(fast.data + " " + slow.data);

            if(fast == slow)
            {
                System.out.println("loop at node: " + slow.data);
                return true;
            }
        }
        
        return false;
    }

    public static void removeLoop(Node head){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = newNode(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = newNode(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, pos);
            
            //removeLoop(head);
            
            if( detectLoop(head) )
                System.out.println("0");
            else
                System.out.println("1");
        }
        
    }
}
