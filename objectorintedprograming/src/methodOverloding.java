class addition{
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int add(int a,int b, int c){
        int d=a+b+c;
        return d;
    }
    public int add(int a,int b, int c,int d){
        int e=a+b+c+d;
        return e;
    }

    public double add(double a,double b){
        double c=a+b;
        return c;
    }
    public String add(String a,String b){
        String c=a+b;
        return c;
    }
}
public class methodOverloding {
    public static void main(String[] args) {
        addition ad=new addition();

        System.out.println("Sum of 10 and 20 is "+ad.add(10 ,20));
        System.out.println("Sum of 10 ,20 and 20 is "+ad.add(10 ,20,20));
        System.out.println("Sum of 10,20,20 and 20 is "+ad.add(10 ,20,20,20));
        System.out.println("Sum of 10.5and 20.5 is "+ad.add(10.5 ,20.5));
    }
}
