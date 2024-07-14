// This is a program to get input to the user the length and weadth of a rectengle and print the the pattern for it

import java.util.Scanner;

public class rectunglePatern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of a rectengle");
        int length = scan.nextInt();
        System.out.println("Enter Wedth of a rectengle");
        int Wedth = scan.nextInt();

        for(int i=0;i<=length-1;i++){
            for(int j=0;j<=Wedth-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
