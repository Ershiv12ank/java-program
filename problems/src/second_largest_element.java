//this is program to check the second largest element of the array

public class second_largest_element {
    public static void main(String[] args) {
        int arr1[]={12,34,56,78,43};
        int max1=arr1[0];
        int max2=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max1){
                max2=max1;
                max1=arr1[i];
            }
            else{
                if(arr1[i]>max2){
                    max2=arr1[i];
                }
            }
        }
        System.out.println("Second maximum element is "+max2);

    }
}
