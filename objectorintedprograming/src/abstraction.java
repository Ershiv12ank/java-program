class Car{
    private void Breakpiston(){
        System.out.println("Break apply");
    }
    private void Accleratepiston(){
        System.out.println("Acclerate the car");
    }
    private void sparkpiston(){
        System.out.println("Start the car ");
    }

    public void start(){
        sparkpiston();
    }
    public void acclerate(){
        Accleratepiston();
    }
    public void stop(){
        Breakpiston();
    }
}
public class abstraction {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.acclerate();
        c.stop();
    }
}
