// this is a program to print Start in one line 
// i.e n=4 then ****
import java.util.Scanner;

public class StarPaterninline {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Star you want to print ");
        int n=scan.nextInt();
        for (int i=0; i<=n-1;i++){
            System.out.print("*");
        }
    }
    
}
