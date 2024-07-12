public class Doublylinkedlist {
    Doublynode head;

    Doublynode tail;
    int size;

    public Doublynode createlinkedlist(int nodevalue) {
        head = new Doublynode();
        Doublynode newnode = new Doublynode();
        newnode.value = nodevalue;
        newnode.next = null;
        newnode.pre = null;
        head = newnode;
        tail = newnode;
        size = 1;
        return head;

    }

    public void InsertioninDDl(int nodevalue, int location) {
        Doublynode newnode = new Doublynode();
        newnode.value = nodevalue;
        if (head == null) {
            createlinkedlist(nodevalue);
            return;
        } else if (location == 0) {
            newnode.next = head;
            newnode.pre = null;
            head.pre = newnode;
            head = newnode;
        } else if (location >= size) {
            newnode.next = null;
            tail.next = newnode;
            newnode.pre = tail;
            tail = newnode;
        } else {
            Doublynode tempnode = head;
            int index = 0;
            while (index <= location - 1) {
                tempnode = tempnode.next;
                index++;
            }
            newnode.pre = tempnode;
            newnode.next = tempnode.next;

            tempnode.next = newnode;
            tempnode.next.pre = tempnode;

        }
        size++;
    }

    public void TraverseDDl() {

        if (head != null) {
            Doublynode tempnode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempnode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempnode = tempnode.next;
            }


        } else {
            System.out.println("Doubly linked is not exit");
        }
        System.out.println("\n");
    }

    public void ReverseTraverseDDl() {

        if (head != null) {
            Doublynode tempnode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempnode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempnode = tempnode.pre;
            }


        } else {
            System.out.println("Doubly linked is not exit");
        }
        System.out.println("\n");
    }

    public boolean searchelement(int nodevale) {
        if (head != null) {
            Doublynode tempnode = head;
            for (int i = 0; i < size; i++) {
                if (tempnode.value == nodevale) {
                    System.out.println("Node found in index " + i);
                    return true;
                }
                tempnode = tempnode.next;
            }
        }
        System.out.println("element is not found in linked list");
        return false;
    }

    public void Deleteelement(int location) {
        if (head == null) {
            System.out.println("NO node found ");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                head = head.next;
                head.pre = null;
                size--;
                return;
            }
        } else if (location >= size) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                Doublynode tempnode = tail.pre;
                tempnode.next = null;
                tail = tempnode;
                size--;
                return;
            }
        } else {
            Doublynode tempnode = head;
            for (int i = 0; i < location - 1; i++) {
                tempnode = tempnode.next;

            }
            tempnode.next = tempnode.next.next;
            tempnode.next.pre = tempnode;
            size--;

        }
    }
    public void DeleteCLL(){
        Doublynode tempnode=head;
        for(int i=0;i<size;i++){
            tempnode.pre=null;
            tempnode=tempnode.next;
        }
        head=null;
        tail=null;
        System.out.println("Doubky linked list is successfully deleted");
    }



}
