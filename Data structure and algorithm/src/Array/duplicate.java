package Array;


import java.util.Arrays;
class array1{
    public  int[] removeDuplicates(int[] arr) {
        //   TODO
        int index=0;


        int arr1[]=new int[arr.length];
        int ind=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length-1;j++){
                if(arr[i]!=arr[j]){
                    arr1[ind]=arr[i];
                    ind++;


                }

            }
        }
        return Arrays.deepToString(arr1[]);
    }
}

    public static void main(String[] args) {
       int  arr[]={1,1,2,2,3,4,5,6};
        array1 e=new array1();
        e.removeDuplicates(arr);

}


