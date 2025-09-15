public class btod {
    public static void main(String[] args) {
        // String binary = "1010";
        // int decimal = Integer.parseInt(binary,2);
        // System.out.println("value is " + decimal);

        int binary = 101011;//32+8+2+1 = 43
        int decimal = 0  , base = 1 , lastd;

        while(binary > 0){
            lastd = binary % 10 ;//1+2+0+8
            decimal += lastd*base;
            binary /= 10;
            base *=2; 
        }
        System.out.println("value is " + decimal);
    }
}
