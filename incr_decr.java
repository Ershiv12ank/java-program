import java.util.Scanner;
public class incr_decr {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number ");
    int a=sc.nextInt();
    a++;
    System.out.println("Increment of number is : "+a);
    a--;
    System.out.println("decrement of number is : "+a);
    }
}
