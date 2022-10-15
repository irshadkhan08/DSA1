package LinkedListBasics1;

public class IntersectionLinkedList {
  static void  prints(Nodes1 head,Nodes2 head1){
      while(head!=null){
          System.out.print(head.data+" -> ");
          head = head.next;
      }
      System.out.println ("end ");
  }
   public static Nodes1  intersection(Nodes1 l1, Nodes2 l2) {
        Nodes1 head = null;
        Nodes1 cur = null;
        while (l1 != null && l2 != null) {
            if (l1.data == l2.data) {
                if (head == null) {
                    head = new Nodes1 ((l1.data));
                    cur = head;
                } else {
                    cur.next = new Nodes1 (l1.data);
                    cur = cur.next;
                }
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1.data < l2.data) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
        }
        return head;
    }

        /* } */
    public static void main(String[] args) {
      Nodes1 n1 = new Nodes1 (10);
      Nodes1 n2 = new Nodes1(20);
      Nodes1 n3 = new Nodes1(30);
      Nodes1 n4 = new Nodes1(40);

      Nodes2 n5 = new Nodes2 (10);
      Nodes2 n6 = new Nodes2(15);
      Nodes2 n7 = new Nodes2(20);
      Nodes2 n8 = new Nodes2 (30);
      Nodes2 n9 = new Nodes2 (40);

      Nodes1 head = n1;
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      Nodes2 head1 = n5;

      n5 = n6.next;
      n6.next = n7;
      n7.next = n8;
      n8.next = n9;
      prints (head,head1);
      intersection (head,head1);
        System.out.println (intersection (head,head1));





    }
}
class Nodes1{
    int data;
    Nodes1 next;
    Nodes1(int data){
      this.data= data;
    }
}
class Nodes2{
    int data;
    Nodes2 next;
    Nodes2(int data){
        this.data = data;
    }
}