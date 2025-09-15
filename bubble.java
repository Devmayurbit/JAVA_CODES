import java.util.Scanner;

public class bubble {

    public static void bubble_sort(int a[]){
        for(int i = 0 ; i<a.length-1;i++){
           // if(a[i]<a[i+1])continue;
            for(int j = 0 ; j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j] ;
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
        public static void print(int arr[]){
            for(int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
       
        bubble_sort(arr);
        print(arr);

    }
}

