//  this is a program a take a input name and  age and print  togather in program
import java.util.Scanner;
public class StrinInput {
    
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter your name :");
    String name = sc.nextLine();
    System.out.println("Enter your age :");
    int age = sc.nextInt();
    System.out.printf("Hello "+name+" you "+ " are "+age+" years old.");
    


    }
    
}
