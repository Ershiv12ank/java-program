
public class right_rotate {
    public static void main(String[] args) {
        int arr[]={12,34,567,21,23};
//        int arr1[]=new int[10];
//            arr1[0]=10;
//        arr1[1]=11;
//        arr1[2]=12;
//        arr1[3]=14;
//        arr1[4]=15;
//        arr1[5]=16;

//        for(int i=0;i<arr1.length;i++){
//            System.out.print(arr1[i]);
//            System.out.print(",");
//        }
        // rigth shift
       int temp= arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }
}

