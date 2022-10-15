package LinkedListBasics1;

public class Traverse {
    //static void printLL(Node head) {
        static void printLL(Node<Integer> head) {
            // Node cur = head;
            Node<Integer> cur = head;
            while (cur != null) {
                System.out.print (cur.data + " ->");
                cur = cur.next;
            }
//    while(head!=null){
//        System.out.print(head.data +" ->");
//        head = head.next ;

            System.out.println (" end ");
        }

        public static void main (String[]args){
//      Node n1 = new Node(10);
//      Node n2 = new Node(20);
//      Node n3 = new Node(30);

            Node<Integer> n1 = new Node<> (10);
            Node<Integer> n2 = new Node<> (20);
            Node<Integer> n3 = new Node<> (30);

            //Node head = n1;
            Node<Integer> head = n1;
            n1.next = n2;
            n2.next = n3;
            printLL (head);

        }
    }

    //class Node{
    class Node<T> {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }