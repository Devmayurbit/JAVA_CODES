interface Mylambda{
    public void display(String str);
}
// class Uselambda{
//     public void calllambda(Mylambda ml){
//         ml.display();
//     }
// }
// class Demo{
//     public void method(){
//         Uselambda ul = new Uselambda();
//         ul.calllambda(()->{System.out.println("mayrur jii");});
//         // int count = 0;
//         // Mylambda obj = ()->{
//         //     System.out.println("hii" + count);
//         // };
//         // obj.display();
//     }
// }
// interface Mylambda{
//     public  int add(int a , int b);
// }

public class laambda {
    public static void main(String[] args) {
        Mylambda ml = System.out::println;
        ml.display("hello");
    //     Demo d = new Demo();
    //    d.method();
        // Mylambda obj = (a, b) -> a + b;
        // System.out.println(obj.add(5, 10));
        // Mylambda obj = (s) -> System.out.println("Hello from lambda" + s);
        // obj.display("mayur");
    }
}
