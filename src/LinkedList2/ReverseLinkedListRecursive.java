package LinkedList2;

public class ReverseLinkedListRecursive {
    static Node1 reverse(Node1 head){

        Node1 cur = head;
        if(cur==null || cur.next ==null) //baseCase
            return cur;
        Node1 temp = cur.next;
        Node1 newNode = reverse (cur.next);
        temp.next = cur;
        cur.next = null;
        return newNode;

//       if(head==null || head.next==null) return head;
//       Node1 temp;
//       temp = head.next;
//       Node1 newNode = reverse (head.next);
//        //Node1 newNode = reverse (temp);
//       temp.next = head;
//       head.next = null;
//       return newNode;
    }
    static void prints(Node1 head){
        while(head!=null){
            System.out.print(head.data+" ->");
            head = head.next;
        }
        System.out.println ("null");
    }
    public static void main(String[] args) {
        Node1 n1 = new Node1 (10);
        Node1 n2 = new Node1 (20);
        Node1 n3 = new Node1 (30);
        Node1 n4 = new Node1 (40);
        Node1 head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        prints (head);
        head = reverse (head);
        prints (head);
    }
}
class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data = data;
    }
}