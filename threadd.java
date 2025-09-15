
// class A extends Thread
class A implements Runnable{
    public void run(){
        for(int i = 0; i< 10 ;i++){
            System.out.println("hi");
            try {
                //it can create gap of 10 millisecond in each iteration
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// class B extends Thread{
    class B implements Runnable{
    public void run(){
        for(int i = 0; i< 10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadd {
    public static void main(String[] args) {
        // A obj  = new A();
        // B obj1 = new B();
        Runnable obj = new A();
        Runnable obj1 = new B();
        // obj.start();
        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // obj1.start();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();

    }
}
    
