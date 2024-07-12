
public class Main {
    public static void main(String[] args) {
        // this is for basic_of_class
//        student sc=new student();
//        sc.name="Shivank pandey";
//        sc.percent=77.9;
//        sc.roll_number=53;
//        System.out.println("Name of student :"+sc.name);
//        System.out.println("percent of student :"+sc.percent);
//        System.out.println("roll number of student :"+sc.roll_number);

        // this is main class code for in capsulation
        Bank b=new Bank();
        b.setDetails(1234,12344.34,"Shivank pandey");
        Bank hol1=new Bank();
        hol1.setDetails(123434,12344333.34,"kamana pandey");

        b.getDetails();
        hol1.getDetails();

        }
    }
