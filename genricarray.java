import java.lang.reflect.Array;

class Myarray<T> {
    T[] A;
    int length = 0;

    @SuppressWarnings("unchecked")
    public Myarray(Class<T> clazz, int size) {
        // Create a generic array safely
        A = (T[]) Array.newInstance(clazz, size);
    }

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class Genricarray {
    public static void main(String[] args) {
        Myarray<Integer> obj = new Myarray<>(Integer.class, 10);
        obj.append(10);
        obj.append(20);
        obj.append(30);
        obj.display();
    }
}



// class Myarray<T>{
//     T A[] = (T[]) new Object[10];
//     int length = 0;

//     public void append(T v){
//         A[length++] = v;
//     }
//     public void display(){
//         for(int i = 0; i < length; i++){
//             System.out.println(A[i]);
//         }
//     }
// }

// public class genricarray {
//     public static void main(String[] args) {
//         Myarray<Integer> obj = new Myarray<>();
//         obj.append(10);
//         obj.append(20);
//         obj.append(30);
//         obj.display();
//     }
// }
