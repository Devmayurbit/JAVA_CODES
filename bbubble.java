public class bbubble{
    public static void printarray(int arr[]){
        for( int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={8,7,3,5,1,4,2,6};

        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 0; j <arr.length-i-1; j++){
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarray(arr);
    }
}