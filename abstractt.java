abstract class car
{
   public abstract void drive();
   public void  booom();

    public void run(){
        System.out.println("suiii");
    }
}

class jeep extends car{
    public void drive(){
    System.out.println("car fun");
    }

    public void booom(){
        System.out.println("hyyy");
    }
}





public class abstractt {
    public static void main(String[] args) {
        car obj1 = new car();
        car obj = new jeep();
       obj.drive();
       obj.run();
       obj.booom();
    }
}
