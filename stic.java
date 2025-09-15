class mobile{
     static String name;
     int mobno;
     String  brand;


     public mobile(){
        System.out.println(" i am the constructor ");
     }
// the ststic block runs first beacause it call the main funtion and the main is also static
     static{
        System.out.println("i am static");
     }
     public void show(){
        System.out.println(brand + " : " + mobno + " : " + name);
     }
}

// without mobile obj we cannot recieve obj of static type so thats why our main 
//fun is also static

    //  public static void show1(mobile ob){
    //     System.out.println(ob.brand + ob.mobno + name);
    //     System.out.println("mayurrr");
    //  }
// }  


public class stic {
 public static void main(String[] args) {
   // Class.forName("mobile");
    // mobile m1 = new mobile();
    // m1.brand="apple";
    // m1.mobno=69;
    // mobile.name="mobile phone";

    //  mobile m2 = new mobile();
    // m2.brand="samsung";
    // m2.mobno=99;
    // mobile.name="mobile phone";

    // m1.show();
    // m1.show();
//     m2.show();
//    //without class name we cannot call the static function directly
//    mobile.show1(m1);
//    mobile.show1(m2);
 }   
}
