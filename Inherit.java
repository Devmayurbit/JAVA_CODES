import java.lang.*;
class Mythread1 implements Runnable
{
    public void run()
    {
        int i=1;
        while (true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
class Inherit
{
    public static void main(String[] args) {
        {
            Mythread1 my=new Mythread1();
            Thread th=new Thread(my);
            th.start();
            
            int i=1;
            while(true)
            {
                System.out.println(i+"World");
                i++;
            }

        }
        
    }
}