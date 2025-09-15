/**
 *  
 */
public class throwss{
    public static void main(String[] args) {
        int i= 0;
        int j= 0; 

        try{
            j= 9/0;
            System.out.println("exception  ...");
        }
        catch(Exception e){
            System.out.println("cannot divide by 0");
        }
        //when we got error or not the finally also print .
        finally{
            System.out.println("hello...");
        }
    }
}
    // public static void divideno(int a ,int b) throws ArithmeticException{
//         if(b==0){
//             throw new ArithmeticException("dicideed bt  zreo !!!1");
//         }
//         System.out.println("result " + (a/b));
//     }
//     public static void main(String[] args) {
//         try{
//             divideno(90,0);
//         }catch(ArithmeticException e){
//             System.out.println("exception caught " + e);
//         }
//     }
// }

//  class  A {
// public void show() throws ClassNotFoundException {
// Class.forName("mobile");
// }
         
// }

// public class throwss {
//     static{
//         System.out.println("class loader");
//     }
//     public static void main(String[] args)throws ClassNotFoundException {
//         A obj = new A();
//         obj.show();
//     }
// }
