import java.util.*;
public class selection_sort {

    public static void selection(int a[]){
        for(int i = 0 ; i<a.length-1 ; i++){
            int minpos = i;

            for(int j = i+1 ; j<a.length;j++){
                if(a[minpos]>a[j]){
                    minpos = j;
                }
            }
            int temp = a[minpos];
            a[minpos] = a[i];
            a[i] = temp; 
        }
    }
    public static void print(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //int arr[] = {3,7,1,9,2,4,8};
        Integer arr[] = {3,7,1,9,2,4,8};
     
     Arrays.sort(arr , 0,3,Collections.reverseOrder());   //  Arrays.sort(arr,0,3);
//selection(arr);
print(arr);
    }
}
