// this is program to search the element present in the array or not if element present the print index of the element
import java.util.Scanner;
public class Search_A_element_in_array {
    public static void main(String[] args) {
        int arr1[]={12,34,56,78,43,45,33,35,5,32,98,12,76,34,2};
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a element ");
        int key= scan.nextInt();

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==key){
                System.out.println("element in "+i+" index");
                System.exit(0);
            }
        }
        System.out.println("Element is not found");

    }
}
