/**
 * sealedd
 */
  sealed class A {

}
 non-sealed class B extends A{

}

final class C extends A{

}
public class sealedd {

    public static void main(String[] args) {
        A obj = new C();
        
    }
}