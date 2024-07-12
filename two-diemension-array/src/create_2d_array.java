public class create_2d_array {
    public static void main(String[] args) {
        // how to create two dieminsion array
       int arr[][]=new int[3][3];
       int arr1[][]={{1,2,3},{2,3,4},{3,4,5}};
       int []arr2[];
       int []a,b,c,d[];// a,b,c are one diemension array and d is two diemension array

        // print the element od 2-d array
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }
        System.out.println("\n\n");
        // print by the for each loop
        int B[][]={{1,2,3},{2,3,4},{3,4,5},{4,4,5}};
        for(int x[]:B){
            for(int y: x){
                System.out.print(y);
                System.out.print(" ");
            }
            System.out.println();
        }

        // jagged array in which every index contain different length array
        int jagg[][]=new int[3][];
        jagg[0]=new int[5];
        jagg[1]=new int[10];
        jagg[2]=new int[15];
        System.out.println("\n\n");
        // print the element of jagged array in which we are not store any value that why show a 0
        for(int i=0;i<jagg.length;i++){
            for(int j=0;j<jagg[i].length;j++){
                System.out.print(jagg[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }

        // by the help of for each loop
        System.out.println("\n\n");
        for(int z[]:jagg){
            for(int y: z){
                System.out.print(y);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
