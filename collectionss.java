import java.util.HashSet;
import java.util.Set;

public class collectionss {
    public static void main(String[] args) {
        //list
// List<Integer> num = new ArrayList<Integer>();
//         num.add(6);
//         num.add(9);
//         num.add(0);

//     System.out.println(num);
//     System.out.println(num.indexOf(9));
//         for (Object n : num){
//             int nums = (Integer)n;
//             System.out.println(nums);
//         }

// set

Set<Integer> num = new HashSet<>();
//for sorted ist use -> Set<Integer> num = new TreeSet<Integer>();
    
num.add(45);
num.add(23);
num.add(69);

for(int n : num){
    System.out.println(n);
}

    }
}
