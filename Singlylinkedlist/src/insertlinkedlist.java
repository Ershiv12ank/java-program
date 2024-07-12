
public class Node1 {
    public int value;
    public Node next;
}
public class insertlinkedlist {
    public class Singlylinkedlist {
        public Node1 head;
        public Node1 tail;

        public int size;

        public Node1 CreateSinglylinkedlist(int Nodevalue) {
            head = new Node1();
            Node1 node = new Node1();
            node.next = null;
            node.value = Nodevalue;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        public void insetiononlinkedlist(int Nodevalue, int location) {
            Node1 node = new Node1();
            node.value = Nodevalue;
            if (head == null) {
                CreateSinglylinkedlist(Nodevalue);
            } else if (location == 0) {

                node.next = head;
                head = node;
            } else if (location >= size) {

                node.next = null;
                tail.next = node;
                tail = node;


            } else {
                Node1 tempnode = new Node1();
                int index = 0;
                while (index == location - 1) {
                    tempnode = tempnode.next;
                    index++;
                }
                Node1 nextnode = tempnode.next;
                tempnode.next = node;
                node.next = nextnode;

            }
            size++;
        }



    }

    public static void main(String[] args) {
        Singlylinkedlist obj=new Singlylinkedlist();

    }
}
