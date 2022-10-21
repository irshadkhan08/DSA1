package LinkedList2;

public class ReverseLinkedListGroupK {
    public static void prints(Node2 head){
        while(head!=null){
            System.out.print(head.data+" ->");
            head = head.next;
        }
        System.out.println ("end");
    }
    public static Node2 reverseK(Node2 head, int k){

        Node2 cur = head,prevFirst = null,newNode = null;
        while(cur!=null){
            int count = 0;
            Node2 prev = null,first = cur;
            while(cur!=null && count<k){
             Node2 temp = cur.next;
             cur.next = prev;
             prev = cur;
             cur = temp;
             count++;
            }
            if(newNode==null){
                newNode = prev;
            }else{
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return newNode;
    }
    public static void main(String[] args) {

        Node2 n1 = new Node2 (1);
        Node2 n2 = new Node2 (2);
        Node2 n3 = new Node2 (3);
        Node2 n4 = new Node2 (4);
        Node2 n5 = new Node2 (5);
        Node2 n6 = new Node2 (6);
        Node2 n7 = new Node2 (7);
        Node2 n8 = new Node2 (8);
        Node2 head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        prints(head);
        int k = 4;

        prints (reverseK(head,k));
    }
}
class Node2{
    int data;
    Node2 next;
    public Node2(int data){
        this.data = data;
    }
}
