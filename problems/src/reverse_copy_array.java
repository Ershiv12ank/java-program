public class reverse_copy_array {
    public static void main(String[] args) {
        int arr1[]={12,34,56,78,43};
        int arr2[]=new int[5];
        for(int j=0,i=arr1.length-1;i>=0;i--){
            arr2[j]=arr1[i];
            j++;
        }
        System.out.println("Array -1 ");
        for(int i=0;i<arr1.length;i++){

            System.out.print(arr1[i]);
            System.out.print(",");
        }
        System.out.println("\nArray - 2");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
            System.out.print(",");
        }
    }
}
