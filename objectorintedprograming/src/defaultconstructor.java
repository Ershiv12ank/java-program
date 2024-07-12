class bank {
    private int accid;
    private String name;
    private double balance;

    public bank(int n,String m,double b) {
            accid =n;
            name=m;
            balance=b;

    }


    public void getDetails(){
        System.out.println("account number"+accid);
        System.out.println("Account holder name "+name);
        System.out.println("Balance "+balance);

    }
}
public class defaultconstructor {
    public static void main(String[] args) {
        bank obj=new bank(1,"Shivank",3432.34);
        obj.getDetails();
    }
}
