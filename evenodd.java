import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("enter value of marks:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int c=sc.nextInt();
        int p=sc.nextInt();
        int e=sc.nextInt();
        int h=sc.nextInt();

        int total=m+c+p+e+h;
        System.out.println("total marks is :"+total);
        int per=total/5;
        System.out.println("the percentage is ->"+per+"%");
if (per>=90){
    System.out.println("A++"+per);
}
else if(per>=60)
{
    System.out.println("A"+per);
}
else if(per>=45)
{
    System.out.println("B"+per);
}
else if(per>=33)
{
    System.out.println("C"+per);
}
else{
    System.out.println("fail"+per);
}
}
       
    }

