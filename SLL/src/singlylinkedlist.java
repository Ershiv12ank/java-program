import java.nio.file.NotDirectoryException;

public class singlylinkedlist {
    public Node head;
    public Node tail;
    int size=1;

    public Node createsinglylinkedlist(int Nodevalue){
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=Nodevalue;
        head=node;
        tail=node;
        size=1;
        return head;
    }

        public void inserele(int nodeValue, int location) {
            Node newnode = new Node();
            newnode.value = nodeValue;
            if (head == null){
                createsinglylinkedlist(nodeValue);
                return;

            }
            else if(location==0){
                newnode.next=head;
                head=newnode;
            }
            else if (location>=size){
                newnode.next=null;
                tail.next=newnode;
                tail=newnode;
            }
            else {
                Node temnode=head;
                int index=0;
                while(index<location-1){
                    temnode=temnode.next;
                    index++;

                }
                Node nextNode = temnode.next;
                temnode.next = newnode;
                newnode.next = nextNode;
            }
            size++;
        }

        public void traversalinlinkedlist(){

        if(head==null){
            System.out.println("No node in linked list");
        }
        else {
            Node tempnode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempnode.value);
            if(i!=size-1){
                    System.out.print("-->");
                }
            tempnode=tempnode.next;
            }

            System.out.println("\n");
        }
        }

        public boolean searchelement(int nodevalue){
        if(head!=null){
            Node tempnode=head;
            for(int i=0;i<size;i++){
                if(tempnode.value==nodevalue){
                    System.out.println("Node is found in "+i+" location");
                    return true;
                }
                tempnode=tempnode.next;
            }
        }
            System.out.println("Node is not found in linked list");
            return false;
        }
       public void deleetnode(int location){
        if(head==null){
            System.out.println("No node in the linked list");
            return;
        }
        else if (location==0){
            head.next=head;
            size--;
            return;
        }
        else if(location>=size){
            Node tempnode=head;

            for(int i=0;i<size;i++){
                tempnode=tempnode.next;
            }
            if(tempnode==head){
                tempnode.next=null;
                size--;
                return;
            }
            tempnode.next=null;
            tail=tempnode;
            size--;
            return;
        }
        else {
            Node tempnode=head;
            for (int i=0;i<location-1;i++){
                tempnode=tempnode.next;
            }
            tempnode.next=tempnode.next.next;
            size--;
        }
       }

       public void deletwholelinkedlist(){
        head=null;
        tail=null;
           System.out.println("Singly linked list deleted successfuly.");
       }

    }

