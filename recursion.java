import java.util.Scanner;



public class recursion {
    public static void print(int n) {
        if(n==9){
            return;
        }
     System.out.println(n);
     print(n+1);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("PLEASE GIVE A NUMBER FOR N :");
    int n=sc.nextInt();    
print(n);
}
    
}  
    

