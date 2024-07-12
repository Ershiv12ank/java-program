import javax.lang.model.type.NullType;

public class increased_size_of_array {
    public static void main(String[] args) {
        int arr1[]={12,34,56,78,43};
        int arr2[]=new int[arr1.length*2];
        for(int i=arr1.length-1;i>=0;i--){
            arr2[i]=arr1[i];

        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
            System.out.print(",");
        }
        arr1=arr2;

        System.out.println("\nArray - 2");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
            System.out.print(",");
        }


    }
}
