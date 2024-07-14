package Array;
import java.util.Scanner;
import java.util.Arrays;

class arraytwod{
    public  int arrd[][];
    public void creattwodarray(int n,int m){
        this.arrd = new int[n][m];
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                arrd[row][col]=Integer.MIN_VALUE;

                }
            }

        }

        public void insert(int row,int col,int value){
        try {
            if(arrd[row][col]==Integer.MAX_VALUE){
                arrd[row][col]=value;
                System.out.println("Successfully inserted");
        }
            else {
                System.out.println("index is filled ");
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bound ");
        }

    }
}
public class insert_element_2d_array {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a length of array ");
//        int index= scan.nextInt();
          arraytwod arrr=new arraytwod();
          // create array
        arrr.creattwodarray(2,2);

        // initilize a value to the array
        arrr.insert(0,0,12);
        arrr.insert(0,1,121);
        arrr.insert(1,0,112);
        arrr.insert(1,1,102);

    }
}
