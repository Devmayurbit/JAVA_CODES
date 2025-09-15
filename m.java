

    public class m{
        int x;
        public m(int y)
        {
           x = y;
        }
        public static void main(String[] args) {
            m ob= new m(6);
            System.out.println(ob.x);
        }
    }/* 
    import java.util.Scanner;
public class m{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(
            "size of array"
        );
        int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    
  /*   int max=arr[0];
    int min=arr[1];

    for(int i=0;i<size;i++){
        if(arr[i]>min){
            min=arr[i];
        }
        if(arr[i]<max){
            max=arr[i];
        }
    }  
        
    
        System.out.println("min"+min);
System.out.println("max"+max);
              }
              boolean sort=true;
              for(int i=1;i<size;i++){
                if(arr[i]<arr[i-1]){
                    sort=false;
                    break;
                }
              }
              if (sort) {
                System.out.println("The array is sorted in ascending order.");
            } else {
                System.out.println("The array is not sorted in ascending order.");
            }

        }    
    }*/