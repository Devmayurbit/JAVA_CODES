public class insertion {
    public static void print(int arr[] ) {
        for(int i=0 ;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[]={6,7,3,4,5,1,2};
        for (int i=1;i<arr.length;i++){
            int current=arr[i];
          int  j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
print(arr);
    }
}
