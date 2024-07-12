// this is program to find the maximum number in array

public class max_element_of_array {
    public static void main(String[] args) {
        int arr1[]={12,34,56,78,43};
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println("Maximum element of arry is "+max);


    }
}
