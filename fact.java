import java.util.Scanner;

public class fact {
    public static int calculate(int n) {
        if(n==0||n==1){
            return 1;
        }
        int nm1=calculate(n-1);
        int num=n*nm1;
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number you want of factorial:");
        int n=sc.nextInt();
        int ans=calculate(n);
        System.out.println(ans);
    }
}
