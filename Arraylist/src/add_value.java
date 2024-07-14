import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class add_value {
    public static void main(String[] args) {
        ArrayList<String>stringlist=new ArrayList<String>();
        stringlist.add("A");
        stringlist.add("B");
        stringlist.add("C");
        stringlist.add("D");
        stringlist.add("E");
        stringlist.add("F");
        stringlist.add("G");


        System.out.println(stringlist);
        stringlist.add(1,"D");
        System.out.println(stringlist);


        ArrayList<Integer>integerslist=new ArrayList<Integer>();
        integerslist.add(12);
        integerslist.add(13);
        integerslist.add(14);
        System.out.println(integerslist);

        integerslist.add(1,14);
//        System.out.println(integerslist);

        // accessing a element in arraylist

//        System.out.println(integerslist.get(0));
//        System.out.println(integerslist.get(1));
//        System.out.println(integerslist.get(2));

// Itrating by for loop

        for(int i=0;i<stringlist.size();i++){
            System.out.println(stringlist.get(i));
        }

// itrating by Itratore


    }
}
