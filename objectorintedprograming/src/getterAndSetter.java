import java.awt.font.ShapeGraphicAttribute;

class product{
    private int id;
    private String name;
    private double balance;

    public void setid(int n){
        if(n<=0){
            System.out.println("Id must be positive ");
            return;
        }
        id=n;
    }
    public void setbalance(double m){
        if(m<=0){
            System.out.println("Id must be positive ");
            return;
        }
        balance=m;
    }
    public void setname(String na){
        name=na;
    }

    public int getId(){
        return id;
    }
    public String  getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

}

public class getterAndSetter {
    public static void main(String[] args) {
        product p1=new product();
        p1.setbalance(1000);
        p1.setid(101);
        p1.setname("Heroin");

        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p1.getBalance());
    }
}
