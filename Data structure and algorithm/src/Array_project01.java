import java.util.Scanner;
class temprature {
    int day[];

    public void takeinput(int days) {
        this.day = new int[days];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= day.length; i++) {
            System.out.printf("Enter %d's day temperature ", i);
            int temp = sc.nextInt();
            day[i - 1] = temp;
        }

    }

    public double average() {
        double sum = 0;
        int count = 0;
        double avg = 0;
        for(int i = 0; i < day.length; i++) {
            sum = sum + day[i];
            count++;

        }
        avg = sum / count;
        return avg;
    }

    public int numberofdayabove(double aver) {
        int no = 0;
        for (int i = 0; i < day.length; i++) {
            if (day[i] > aver) {
                no++;

            }

        }
        return no;
    }
    public void model(int days){
        double aver1;
        int no_days;
        takeinput(days);

        aver1=average();
        no_days=numberofdayabove(aver1);
        System.out.println("Average temperature :"+aver1);
        System.out.println("Number of days temperature is above average "+no_days+" Days.");




    }

}
public class Array_project01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of days :");
        int days= scan.nextInt();
        temprature t=new temprature();
        t.model(days);



    }
}
