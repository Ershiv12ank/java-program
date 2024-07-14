// This is program to print
import java.util.Scanner;

public class SquarePatern {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number of row in square");
    int num=scan.nextInt();
    for(int i=0;i<=num-1;i++){
        for (int j=0; j<=num-1;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    
    }

}
    
}
