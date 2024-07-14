import java.util.Scanner;
public class Input {
public static void main(String [] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your age" );
    System.out.println("Enter your name  : ");
    System.out.println("Enter average marks : ");
    int age=scan.nextInt();
    System.out.println("age is "+ age);

    // Enter a float number 
    Double avr=scan.nextDouble();
    System.out.println("Your average marks is :" + avr);

    // Enter a string 
    String name=scan.nextLine();
    System.out.println("Your name is :" + name);   

}
    
}
