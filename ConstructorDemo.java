 public class ConstructorDemo {
    int x;
    int y;

    // Default constructor
    public ConstructorDemo() {
        x = 0;
        y = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public ConstructorDemo(int a, int b) {
        x = a;
        y = b;
        System.out.println("Parameterized constructor called");
    }

    // Constructor with one parameter
    // public ConstructorDemo(int a) {
    //     x = a;
    //     y = 0;
    //     System.out.println("Constructor with one parameter called");
    // }

    //copy constructor
    public ConstructorDemo(ConstructorDemo cons){
        this.x=cons.x;
        this.y=cons.y;
        System.out.println("copyconstructor called");
    }

    public void display() {
        System.out.println("x: " + x + ", y: " + y);
    }
                

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorDemo obj1 = new ConstructorDemo(); // Default constructor
        obj1.display();
        
        ConstructorDemo obj2 = new ConstructorDemo(5, 10); // Parameterized constructor
        obj2.display();
        
        // ConstructorDemo obj3 = new ConstructorDemo(7); // Constructor with one parameter
        // obj3.display();

        ConstructorDemo obj4 = new ConstructorDemo(obj2);
        obj4.display();
    }

}

