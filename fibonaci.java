import java.util.Scanner;

public class fibonaci {
    public static void fib(int a,int b,int n) {
       if(n==0){
        return;
       } 
       int c=a+b;
       System.out.print("  "+c  + " ");
       fib(b,c,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the value of n:");
        int n=sc.nextInt();

        int a=0;
        int b=1;
        System.out.print("fib series is: "+a);
        System.out.print(" "+b);
       
        fib(a, b, n-2);
        
    }
}



class sum {
    public int add(int a, int b) {
        int r = a + b;
        return r;
    }
}

public class classs {
    public static void main(String[] args) {

        int num1 = 60;
        int num2 = 9;

        sum s = new sum();
        int r = s.add(num1, num2);
        System.out.println(" the sum is : " + r);
    }
}
