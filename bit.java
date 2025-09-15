public class bit {
    public static void main(String[] args) {
        int num=5;
        int pos=2;
        int bitwise=2<<pos;
        int newnum=bitwise & num;
        System.out.println(newnum);
        int newnum1=bitwise | num;
        System.out.println(newnum1);
    }
}
//1000
//1010