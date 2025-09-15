import java.lang.Thread.State;
import java.util.Scanner;

/**
 * day_3s
 */
public class day_3s {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =  sc.nextInt();

        while(T-- > 0)
        {
            int direction = sc.nextInt();
            int noofrotation = sc.nextInt();
            int N = sc.nextInt();

            int[] supplies = new int[N];

         for(int i=0 ; i<N ;i++){
            supplies[i] = sc.nextInt();
         }
noofrotation = noofrotation % N;

if(direction==0){
    rotateLeft(supplies,noofrotation);
}else{
    rotateRight(supplies,noofrotation);
}
for(int i = 0;i<N;i++){
    System.out.print(supplies[i] + " ");
}
System.out.println();
        }
        sc.close();
    }
    private static void rotateLeft(int []arr, int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    private static void rotateRight(int[] arr,int k){
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr, int start , int end){
     while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
     start++;
     end--;
     }   
    }
}
/* import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while(T-- > 0){
            int direction  = scanner.nextInt();
            int noOfRotations =scanner.nextInt();
            int N = scanner.nextInt();
            
            int[] supplies = new int[N];
            
            for(int i=0 ; i<N ; i++){
                supplies[i] = scanner.nextInt();
            }
            
            noOfRotations = noOfRotations % N;
            
            if(direction == 0){
                rotateLeft(supplies,noOfRotations);
            } else{
                rotateRight(supplies,noOfRotations);
            }
            
            for(int i=0;i<N;i++){
                System.out.print(supplies[i] +" ");
            }
            System.out.println();
        }
        scanner.close();
    }
    
     private static void rotateLeft(int[] arr, int k)
     {
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
     private static void rotateRight(int[] arr , int k)
    {
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}*/