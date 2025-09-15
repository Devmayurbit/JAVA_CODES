class Counter {
    int count;
    public synchronized void increment()
    {
        count++;
    }
}

public class synchronized_thread {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
       Runnable obj = () ->{
            for(int i = 0 ;i <10000 ; i++){
c.increment();
System.out.println("Current count1: " + c.count);
            }
        };

        Runnable obj1 = () ->{
            for(int i =0 ; i <10000 ; i++){
c.increment();
System.out.println("Current count: " + c.count);
            }   
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
