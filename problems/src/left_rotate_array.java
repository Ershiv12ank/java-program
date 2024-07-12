// this is progarm to rotate the  array in left side

public class left_rotate_array {
    public static void main(String[] args) {
        int arr1[]={12,34,56,78,43};
        int t=arr1[0];

        for(int i=1;i<arr1.length;i++){
            arr1[i-1]=arr1[i];
        }
        arr1[arr1.length-1]=t;
        for(int x:arr1){
            System.out.println(x);
        }
    }

}
