import java.util.Arrays;
import java.util.List;

public class foreachh{
    public static void main(String[] args) {


int arr[] = {3,9,7,8,12,6,15,5,4,100};
int max= arr[0];
for(int i = 0 ; i<=arr.length-1;i++){
if(max < arr[i]){
max=arr[i];
//System.out.println("Element found at index  : " + i);
//System.exit(0);
}

//sum  = sum + arr[i];

}
System.out.println(max);
//System.out.println(" !!!! Element  not found at  any index  !!!!");
//System.out.println(sum);
        //List<Integer> nums = Arrays.asList(6 ,2 ,8 ,4,9,1);

       // Consumer<Integer> con = n -> System.out.println(n);
        
       // nums.forEach(n-> System.out.println(n));
    }
}
