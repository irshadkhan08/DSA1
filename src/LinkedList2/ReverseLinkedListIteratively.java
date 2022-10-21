package LinkedList2;



public class ReverseLinkedListIteratively {
    public static void prints(Node head){
        while(head!=null) {
            System.out.print (head.data + " -> ");
            head = head.next;
        }
        System.out.println ("null ");
    }
    public static Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur!=null){//null!=null is false
            // 10->20->30->40->50->null
            Node temp;
            temp = cur.next;//20//30//40//50//null
            cur.next = prev;//null//10//20//30//40
            prev = cur;//null<-10<-20<-30<-40->50
            cur = temp;//20//30//40//50//null
        }
        return prev;//null<-10<-20<-30<-40-50

    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        prints(head);
       head = reverse (head);
        prints(head);
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}