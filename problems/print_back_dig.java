package problems;
import java.util.Scanner;
public class printStarInDig {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=scan.nextInt();
        for(int i=0; i<=n+1;i++){
            for(int j=0;j<=n+1;j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    if(i+j==n-1){
                        System.out.print("*");
                    }
                    else{
                    System.out.print(" ");
                    }
                }
            }
            System.err.println("");
        }

    }
    
}
