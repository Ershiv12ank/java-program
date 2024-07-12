import java.util.Scanner;

public class insterElement {
    public static void main(String[] args) {

        int arr1[]=new int[10];
            arr1[0]=10;
        arr1[1]=11;
        arr1[2]=12;
        arr1[3]=14;
        arr1[4]=15;
        arr1[5]=16;

        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]);
            System.out.print(",");
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("\nenter a element ");
        int ele= scan.nextInt();
        System.out.println("enter a index ");
        int ind= scan.nextInt();
        for(int i=arr1.length-1;i>=ind;i--){
            arr1[i]=arr1[i-1];
        }
        arr1[ind]=ele;
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
            System.out.print(",");
        }


    }
    }

