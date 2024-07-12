//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        singlylinkedlist obj=new singlylinkedlist();
        obj.inserele(12,1);
        obj.inserele(13,2);
        obj.inserele(14,3);
        obj.inserele(15,4);
        obj.inserele(16,5);
        obj.inserele(11,0);

//        System.out.println(obj.head.value);
//        System.out.println(obj.head.next.value);

        obj.traversalinlinkedlist();

        obj.searchelement(14);
        obj.deleetnode(4);
        obj.traversalinlinkedlist();
        obj.deletwholelinkedlist();
        obj.traversalinlinkedlist();


        }
    }
