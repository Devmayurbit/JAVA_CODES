public class search {

    public static int binary_search(int arr[] , int left , int right , int target)
    {
        if(left > right){
            return -1;
        }

        int mid = left+ (right - left) / 2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]>target){
            return binary_search(arr, left, mid-1, target);
        }
        else{
            return binary_search(arr, mid+1, right, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,11,23,45,67,89,99};
        int target = 67;

        int index =binary_search(arr,0,arr.length-1,target);

        if(index != -1){
            System.out.println("the element found at index : " + index);
        }
        else{
            System.out.println("element not found !!");
        }
    }
}
