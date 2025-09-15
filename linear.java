import java.util.Scanner;

public class linear {
     
    public static int linearsearch(int arr[] ,int key){
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements :");
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
       System.out.println("enter key to be searched ");
        int key =  sc.nextInt();
         
        int index = linearsearch(arr,key);
       
        if(index != -1){
            System.out.println("element found at index " + index);
        }
        else{
            System.out.println("element not found");
        }
      sc.close();
    }
}
