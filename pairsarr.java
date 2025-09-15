public class pairsarr {

    public static void pairs(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            int current = arr[i];

            for(int j = i+1;  j<arr.length ; j++){
                System.out.print("("  + current + " , " + arr[j]  + ")");
            }
            System.out.println();
        }
    }

    public static void sub_arr(int a[]){
        for(int i = 0 ; i<a.length ; i++){
            for(int j= i; j<a.length ; j++){
                for(int k = i ; k<=j ;k++){
                    System.out.print("[ " + a[k] + " ]" + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int kadens_algo(int n[]){
        int max = Integer.MIN_VALUE;
        int curr=0;

        for(int num:n){
            curr += num;
            if(curr>max){
                max=curr;
            }
            if(curr<num){
                curr=num;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,-4,-1,-2,-1,-5,-3};
//pairs(num);
//   sub_arr(num);
System.out.println("maxmimum sum of arr is " + kadens_algo(num));
    }
}
