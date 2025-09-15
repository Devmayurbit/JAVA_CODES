class  NavinException extends Exception{
    public NavinException(String string){
        super(string);
    }
}


public class excep {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        // int arr[] = new int[7];
        // String str = null;x

        try{
           
            if (i == 0){
            throw new NavinException(" i dont want to / by 0 zero  ");
            // System.out.println(arr[7]);
            // System.out.println(str.length());
        } 
          j = 9/i;
        }

        catch(NavinException e){
            System.out.println("cannot divide by zero !1 " + e);
        }

        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("be in your limit !!");
        // }
        //the exception class would be in last of all catch class.
        catch(Exception e){
            System.out.println("something went wrong" + e);
        }
    
    }
}
