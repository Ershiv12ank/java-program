public class Circulardoblylinkedlist {
    CirclureNode head;
    CirclureNode tail;
    int size;

    public CirclureNode CreateCirclurelinkedlist(int nodeValue){
        head=new CirclureNode();
        CirclureNode newnode=new CirclureNode();
        newnode.value=nodeValue;
        head=newnode;
        tail=newnode;
        newnode.next=newnode;
        newnode.prev=newnode;
        size=1;
        return head;

    }
}
