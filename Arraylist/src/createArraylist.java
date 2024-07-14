import java.util.ArrayList;
import java.util.Arrays;

public class createArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<Integer>(); // by default it is take 10 place.
        ArrayList<Integer> lst1=new ArrayList<Integer>(Arrays.asList(1,2));;//ijn which we create a storage in 13 place.

        System.out.println(lst1);
    }
}
