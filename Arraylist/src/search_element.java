import java.util.ArrayList;
import java.util.Arrays;

public class search_element {
    public static void main(String[] args) {
        ArrayList<String> StrList=new ArrayList<String>(Arrays.asList("A","B","C","D"));
        // by the help of each for loop
        for(int letter:StrList){
            if(letter){
                System.out.println("Element is found ");
            }
            else {
                System.out.println("Element is not found ");
            }
        }
    }
}
