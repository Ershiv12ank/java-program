// this is for pass by value


public class argumentPassing {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;
        System.out.printf("before increment %d and %d \n",a,b);
        increment(a,b);
        System.out.printf("after increment %d and %d ",a,b);

    }
    public static void increment(int a,int b){
        a=a+5;
        b=b+5;
    }
    
}
