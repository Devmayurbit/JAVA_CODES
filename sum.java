
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.print("enter value of n:");
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
int esum=0;
int osum=0;
while(i<=n)
{
    if(i%2==0)
        esum=esum+i;
    else
        osum=osum+i;
        
    i++;
}
System.out.println(esum);
System.out.println(osum);


    }
}
