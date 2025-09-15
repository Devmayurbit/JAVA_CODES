public class large_small {

    public static int large_num(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<num.length;i++){
            if(largest<num[i]){
                largest = num[i];
            }
        }
        return largest;
    }

    public static int small_num(int num[])
    {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<num.length;i++){
            if(smallest>num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int num[] = {3 ,5 ,7,24,56,78,99};
       System.out.println("the lagest num is " + large_num(num));
       System.out.println("the smallest number is " + small_num(num));
    }
}
