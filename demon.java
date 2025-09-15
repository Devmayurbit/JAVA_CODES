class Mythreead extends Thread{

public void run(){
    int i = 1;
    while(true){
        System.out.println(i++ + "class ");
    }
}
}
public class demon{
    public static void main(String[] args) {
      Mythreead t = new Mythreead();
      t.start();
      int i = 1;
    while(true){
        System.out.println(i++ + "main");

        Thread.yield(); // Yielding to allow the other thread to runz
    }
      //t.setDaemon(true);
      
    //   Thread mainThread   = Thread.currentThread();
    //   mainThread.join();
            
    }
}
