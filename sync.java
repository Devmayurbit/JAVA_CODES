class Mydata{
    public void display(String str){
        synchronized(this){
for(int i = 0 ;i<str.length(); i++){
    System.out.println(str.charAt(i));
    }}
}
}

 class Mythread1 extends Thread{
    Mydata data;
   // String str;

    public Mythread1(Mydata data) {
        this.data = data;
      //  this.str = str;
    }

    public void run() {
        data.display("Hello");
        // synchronized (data) {
        //     data.display("Hello");
        // }
    }
}

 class Mythread2 extends Thread{
    Mydata data;
   // String str;

    public Mythread2(Mydata data) {
        this.data = data;
      //  this.str = str;
    }

    public void run() {
        data.display("world");
        // synchronized (data) {
        //     d.display("world");
        // }
    }
}
public class sync {
    public static void main(String[] args) {
        Mydata data = new Mydata();
        Mythread1 t1 = new Mythread1(data);
        Mythread2 t2 = new Mythread2(data);
        t1.start();
        t2.start();
    }
}
