import java.util.*;
public class recurnsionofn {
    public static void print(int n,int i,int sum) {
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        print(n, i+1, sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("PLEASE GIVE A NUMBER FOR N :");
    int n=sc.nextInt();
      print(n, 1,0);  
    }
    
}
