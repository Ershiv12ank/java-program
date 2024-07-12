//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        circlurelinkedlist obj=new circlurelinkedlist();
        obj.CreateCirclurelinkedlist(12);

        System.out.println(obj.head.value);
        System.out.println(obj.head.next.value);

        obj.insertelementincll(12,0);
        obj.insertelementincll(12,1);
        obj.insertelementincll(13,2);
        obj.insertelementincll(14,3);
        obj.insertelementincll(15,4);

        obj.circlurelinkedlisttraversal();
        System.out.println(" ");
        obj.searchelementCll(12);


        obj.deleteelement(1);

        obj.circlurelinkedlisttraversal();
        System.out.println("\n");
        obj.deletecircularlinkedlist();



        }
    }
