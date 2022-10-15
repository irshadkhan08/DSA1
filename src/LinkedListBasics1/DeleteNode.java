package LinkedListBasics1;

public class DeleteNode {
    public static void prints(Node2 head){
        Node2 cur = head;
        while(cur!=null){
            System.out.print (cur.data+" ->");
            cur = cur.next;
        }
        System.out.println (" end");
    }
    public static Node2 delete(int pos,Node2 head) {

        if(head==null) return head;
        if(pos==0){
            head = head.next;
            return head;
        }
        Node2 cur = head;
        for(int i = 0; i<pos-1; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node2 n1 = new Node2 (10);
        Node2 n2 = new Node2 (20);
        Node2 n3 = new Node2 (30);
        Node2 n4 = new Node2 (40);
        Node2 n5 = new Node2 (50);
        Node2 n6 = new Node2 (60);
        Node2 head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        prints(head);
       head =  delete(0,head);
       prints(head);
    }
}
class Node2{
    int data;
    Node2 next;
    public Node2(int data){
        this.data= data;
    }
}