/**
 * run_poly
 */


 class A
 {
    public void show(){
        System.out.println("in a");
    }
 }

 class B extends A{
    public void show1(){
        System.out.println(" in b");
    }
 }

public class run_poly {

    public static void main(String[] args) {
    A obj2 =  new A();
    obj2.show();
//upcasting
    A obj = (A)new B();
    obj.show();
//downcasting
    B obj1 =(B)obj;
    obj1.show1();


    
    // obj = new B();
    // obj.show();
    }
}