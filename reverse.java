public class reverse {

    public static void reverse_arr(int arr[]){
        int first = 0 , last = arr.length-1;

        while(first<last)
        {
            int temp = arr[last];
            arr[last]= arr[first];
        arr[first]   = temp;

        first++;
        last--;
        }

    }
    public static void main(String[] args) {
        int arr[] = {3 , 6, 8,  9,34,56,78,99,123,456,789};

        reverse_arr(arr);
        for(int i = 0 ; i<arr.length;i++){
            System.out.print("revese array is : "+arr[i]);
        }
        System.out.println();
    }
}
