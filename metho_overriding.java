/**
 * metho_overriding
 */

 class a {
    public void showw(){
        System.out.println("in a");
    }
 }

 class b extends a{ 
   
    public void show(){
        System.out.println("in b");
    }
 }
public class metho_overriding {

    public static void main(String[] args) {
        // a c = new a();
        // c.show();
        b d = new b();
       d.showw();
        
    }
}