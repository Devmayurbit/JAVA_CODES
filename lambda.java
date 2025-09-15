7// import java.lang.invoke.LambdaConversionException;
//code 2
// @FunctionalInterface
// interface A{
//     // void show(int i);
//     int add(int i , int j);
// }

public class lambda {
    public static void main(String[] args) {
//code 1
Runnable obj1 = () ->{
 for(int i = 0 ; i< 5 ; i++){
    System.out.println("hi");
    try{
        Thread.sleep(10);
    }catch(InterruptedException e){
           e.printStackTrace();
    }
 }
};

Runnable obj2 = () ->{
    for(int i = 0 ; i< 5 ; i++){
       System.out.println("hello !!");
       try{
           Thread.sleep(10);
       }catch(InterruptedException e){
              e.printStackTrace();
       }
    }
   };

   Thread t1 =  new Thread(obj1);
   Thread t2 =  new Thread(obj2);

   t1.start();
   t2.start();



        //code 2
        // A ob = (i,j) -> i+j;
        // int r1 = ob.add(69,9 );
        // System.out.println("the value of add function is : " + r1);
    // A obj = i ->System.out.println("i demo class " + i);
    // obj.show(69);        
    }
}
