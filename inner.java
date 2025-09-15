class A{
    public void display(){
        System.out.println("in a ");
    }

//     class B {
//         public void show(){
//         System.out.println("in b ");
//     }
// }
}


public class inner {
    public static void main(String[] args) {
        A obj =  new A()
        {
            public void display(){
                System.out.println("in new a ");
            } 
        };
        obj.display();
        

        // A.B obj1 = obj.new B();
        // obj1.show();

     }
}
