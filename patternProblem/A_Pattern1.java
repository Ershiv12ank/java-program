package patternProblem;
import java.util.Scanner;

public class A_Pattern1{
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter the length");
int num=scan.nextInt();
for(int i=0;i<=num-1;i++){
    for (int j=0;j<=num-1;j++){
        if(i==0||i==num/2){
            System.out.print("*"); 
        }
        else{
            if(j==0 || j==num-1){
                System.out.print("*"); 
        }
        else{
            System.out.print(" ");
            }
            }
        }

        System.out.print("\n");
    }
}
      

    }
    

