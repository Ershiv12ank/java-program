package problems;
import java.util.Scanner;
public class cross {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in) ;
       System.out.println("Enter the number of rows");
       int n=scan.nextInt();
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j || i+j==n-1){
                System.out.print("*");
            }
            else{
                System.out.println(" ");
            }
        }
        System.out.println();
       }

    }
    
}
