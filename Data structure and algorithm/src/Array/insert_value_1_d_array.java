package Array;

import java.util.Scanner;
class one_diem_array{
    int arr[]=null;
    public void insert(int size){
        arr=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=Integer.MAX_VALUE;
        }

    }
    public  void insert(int location , int value){
        try {
            if(arr[location]==Integer.MAX_VALUE){
                arr[location]=value;
                System.out.println("Inserted successfully");
            }
            else {
                System.out.println("Inserted unsuccessfully");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }

    }
    public void traverse(){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
public class insert_value_1_d_array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int size=scan.nextInt();
//        System.out.println("Enter a index of array :");
//        int num=scan.nextInt();
//        System.out.printf("Enter a value of %d index :",num);
//        int val=scan.nextInt();
        one_diem_array ar=new one_diem_array();
        ar.insert(size);
//        ar.insert(num,val);
        ar.insert(0,12);
        ar.insert(1,12);
        ar.insert(2,12);
        ar.insert(3,12);
        ar.insert(4,12);
        ar.insert(5,12);

        // accessing the element
        System.out.println(ar.arr[0]);
        System.out.println(ar.arr[1]);
        System.out.println(ar.arr[2]);
        System.out.println(ar.arr[3]);
        System.out.println(ar.arr[4]);
        System.out.println(ar.arr[5]);

        // array traverse
        ar.traverse();


    }
}
