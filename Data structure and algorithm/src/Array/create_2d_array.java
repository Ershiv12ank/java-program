package Array;
import java.util.Arrays;

public class create_2d_array {
    public static void main(String[] args) {
        int arr[][];
        arr=new int[2][2];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;

        System.out.println(Arrays.deepToString(arr));
        String str[][]={{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(str));

    }
}
