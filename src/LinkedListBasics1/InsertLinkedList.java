package LinkedListBasics1;

public class InsertLinkedList {
//    static void show(Node1 head,int pos){

    static void prints(Node1 head) {
        while (head != null) {
            System.out.print (head.data + " -> ");
            head = head.next;
        }
        System.out.println (" end");
    }
    static Node1 insert(int data, int pos , Node1 head){
       Node1 newNode = new Node1 (data);
        if(pos==0){
            newNode.next = head;
            head= newNode;
            return head;
        }
        Node1 cur = head;
        for(int i  = 0; i<pos-1; i++){
           // head = head.next;
            cur = cur.next;
            if(cur==null) return head;
        }
//        newNode.next = head.next;
//        head.next = newNode;
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
    }
    public static void main(String[] args) {
       Node1 n1 = new Node1(10);
       Node1 n2 = new Node1(20);
       Node1 n3 = new Node1(30);

       Node1 head = n1;
       n1.next = n2;
       n2.next = n3;
       prints (head);
       head = insert(134,2,head);
       prints(head);
    }
}
class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data = data;
    }
}