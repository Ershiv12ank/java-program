public class Singlylinkedlist {
    public Node head;
    public Node tail;

    public int size;
    public Node CreateSinglylinkedlist(int Nodevalue){
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=Nodevalue;
        head=node;
        tail=node;
        size=1;
        return head;
    }
}
