public class basic_array {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int arr1[]={12,34,56,78,43};
        int []arr3;
        arr3=new int[5];
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        for(int i=0;i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]++);
        }
        for(int x:arr1){
            System.out.println(x);
        }



    }
}
