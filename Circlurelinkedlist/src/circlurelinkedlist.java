public class circlurelinkedlist {
    public Node head;
    public Node tail;
    public int size;

    public Node CreateCirclurelinkedlist(int Nodevalue){
        head=new Node();
        Node node=new Node();
        node.value=Nodevalue;
        node.next=node;
        head=node;
        tail=node;
        size=1;
        return head;

    }

    public void insertelementincll(int nodevalue,int loation){
        //head=new Node();
        Node newnode=new Node();
        newnode.value=nodevalue;
        if(head==null){
            CreateCirclurelinkedlist(nodevalue);
            return;
        }
        else if(loation==0){
            newnode.next=head;
            head=newnode;
            tail.next=head;

        }
        else if(loation>=size){
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
        else {
            Node tempnode=head;
            int index=0;
            while (index<loation-1){
                tempnode=tempnode.next;
                index++;
            }
            newnode.next=tempnode.next;
            tempnode.next=newnode;
        }
        size++;
    }

    public void circlurelinkedlisttraversal() {
        if (head != null) {
            Node tempnode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempnode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempnode = tempnode.next;
            }
        } else {
            System.out.print("\n No node in the circlure linked list ");
        }
    }

     public boolean searchelementCll(int nodevalue){

        if(head!=null){
            Node tempnode=head;
            for(int i = 0; i<size ; i++){
                if(head.value==nodevalue){
                    System.out.println("Node value found in "+i+" index");
                    return true;
                }
                tempnode=tempnode.next;
            }

        }
         System.out.println("Node not found in linked list");
        return false;
     }

     public void deleteelement(int location){
        if(head==null){
            System.out.println("No node found");
        }
        else if(location==0){
            head=head.next;
            tail=head;
            size--;

        }
        else if(size==0){

            tail=null;
            head.next=null;
            head=null;

        } else if (location>=size) {
            Node tempnode=head;
            for(int i=0;i<location-1;i++){
                tempnode=tempnode.next;
            }
            if(tempnode==head){
                head.next=null;
                tail=null;
                head=null;
                size--;
            }

                tail=tempnode;
                tempnode.next=head;
                size--;



        }
        else {
            Node tempnode=head;
            for(int i=0;i<location-1;i++){
                tempnode=tempnode.next;

            }
            tempnode.next=tempnode.next.next;
            size--;
        }

     }

     public void deletecircularlinkedlist(){
       if(head==null){
           System.out.println("No node on linked list");
       }
       else {
           head.next=null;
           tail.next=null;
           tail=null;
           System.out.println("No node in a linked list");
       }
     }


}
