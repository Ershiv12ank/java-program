import java.util.Scanner;
public class T_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of rectangle ");
        int num1=scan.nextInt();
        for(int i=0;i<=num1-1;i++){
            for(int j=0;j<=num1-1;j++){
                if(i==0||j==num1/2){
                    System.out.print("*");
                }
                else{
                   
                        System.out.println(" ");
                    }
                }
                System.out.println("\n");
            }
        }

    }
    
    
