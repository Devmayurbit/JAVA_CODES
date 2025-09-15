public class dtob {
    public static void main(String[] args) {
        int decimal = 11;
// String binary =  Integer.toBinaryString(decimal);
// System.out.println(binary);

String binary = "";
while(decimal > 0){
    binary = (decimal % 2) + binary;
    decimal /= 2;
}
System.out.println(binary);
    }
}
