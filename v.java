class A{
    int x =10;
}

public class v {
    public static void main(String[] args) {
        // var  num =  new num[10];
       A obj1 = new A();
       A obj2 = obj1;
       obj2.x = 20;
       System.out.println(obj1.x);
    }
}
