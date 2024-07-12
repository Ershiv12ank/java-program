//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doublylinkedlist obj=new Doublylinkedlist();


        obj.InsertioninDDl(12,0);
        obj.InsertioninDDl(13,1);
        obj.InsertioninDDl(14,2);
        obj.InsertioninDDl(15,3);
        obj.InsertioninDDl(16,4);
        obj.InsertioninDDl(14,5);



        obj.TraverseDDl();

        obj.ReverseTraverseDDl();

        obj.searchelement(15);
        obj.Deleteelement(1);
        obj.ReverseTraverseDDl();

        obj.DeleteCLL();



    }
}