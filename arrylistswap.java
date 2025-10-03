import java.util.ArrayList;

public class arrylistswap {
    public static void swapy(ArrayList<Integer> swap, int idx1, int idx2){
      int temp  = swap.get(idx1);
      swap.set(idx1, swap.get(idx2));
      swap.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> swap = new ArrayList<>();
        swap.add(5);
        swap.add(3);
        swap.add(6);
        swap.add(9);
        swap.add(12);

        int idx1 = 2 ;
         int idx2 = 4;
         System.out.println(swap);
         swapy(swap,idx1,idx2);
                  System.out.println(swap);

    }
}
