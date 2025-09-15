
class methods{
    public void dept(){
        System.out.println("hii , i am from cse branch ");
    }

    public String pen(int cost){
        if (cost>=10)        
        return "pen";
        return "lwda lo";
    }
}


public class classs{
    public static void main(String[] args) {
        
        methods mc = new methods();
        mc.dept();
       String r = mc.pen(69);
       System.out.println(r);
    }
}






// class sum {
//     public int add(int a, int b) {
//         int r = a + b;
//         return r;
//     }
// }

// public class classs {
//     public static void main(String[] args) {

//         int num1 = 60;
//         int num2 = 9;

//         sum s = new sum();
//         int r = s.add(num1, num2);
//         System.out.println(" the sum is : " + r);
//     }
// }
