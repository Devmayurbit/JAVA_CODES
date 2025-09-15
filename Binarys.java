import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class Binarys {
    public static int bs(int arr[],int n,int low,int high) {
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==n){
            return mid;
        }
        else if(arr[mid]<n){
           return bs(arr, n, mid+1, high);
        }
        else{
           return bs(arr, n, low, mid-1);
        }
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("enetr elements in sorted order :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter elements to be searched order");
        int n=sc.nextInt();
        int index=bs(arr,n,0,size-1);
        if(index!=-1){
            System.out.println("element foud at index "+index);
        }
        else{
            System.out.println("element not found//!!");
        }
    }
}
