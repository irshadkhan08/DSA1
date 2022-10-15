package LinkedListBasics1;

public class FindMiddleElement {
    public static void prints(Nodes head){
        Nodes cur = head;
        while(cur!=null){
            System.out.print (cur.data+" ->");
            cur = cur.next;
        }
        System.out.println(" end");
    }
    public static int FindElement(Nodes head){
       // slow and fast variable name
        Nodes slow = head;
        Nodes fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
           // fast = fast.next.next.next.next.next;
           fast = fast.next.next;
        }
//        return fast.data; //50
        return slow.data;
    }
    public static void main(String[] args) {
        Nodes n1 = new Nodes (10);
        Nodes n2 = new Nodes(20);
        Nodes n3 = new Nodes(30);
        Nodes n4 = new Nodes(40);
        Nodes n5 = new Nodes(50);
        Nodes head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        prints(head);
//        FindElement( head);
        //prints (head);
        System.out.println (FindElement( head));
    }
}
class Nodes{
    int data;
    Nodes next;
   public Nodes(int data){
        this.data= data;
    }
}