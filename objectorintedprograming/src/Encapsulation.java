class Bank{
    private int account_number;
    private double Bank_balance;
    private String name  ;

    public void setDetails(int a,double b,String c ){
        account_number=a;
        Bank_balance=b;
        name =c;
    }
    public void getDetails(){
        System.out.println("Name of account holder :"+name);
        System.out.println("account number :"+account_number);
        System.out.println("Bank balance  :"+Bank_balance);

    }
}

