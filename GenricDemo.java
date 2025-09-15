// public class GenricDemo<T>{
// T[] data =  (T[]) new Object[10];
   
//     public static void main(String[] args) {
//         GenricDemo<String> obj = new GenricDemo();
//         obj.data[0] = "Hello";  
//         System.out.println(obj.data[0]);
//     }
// }
// public class GenricDemo<T> {
//     T[] data;

//     @SuppressWarnings("unchecked")
//     public GenricDemo() {
//         // Create an Object array and cast to T[] safely with a warning suppressed
//         data = (T[]) new Object[10];
//     }

//     public static void main(String[] args) {
//         GenricDemo<String> obj = new GenricDemo<String>();
//         obj.data[0] = "Hello";
//         System.out.println(obj.data[0]);
//     }
// }


import java.lang.reflect.Array;

public class GenricDemo<T> {
    T[] data;

    @SuppressWarnings("unchecked")
    public GenricDemo(Class<T> clazz, int size) {
        // Create a generic array using reflection
        data = (T[]) Array.newInstance(clazz, size);
    }

    public static void main(String[] args) {
        // Pass the class type so the array can be created correctly
        GenricDemo<String> obj = new GenricDemo<>(String.class, 10);
        obj.data[0] = "Hello";
        System.out.println(obj.data[0]);
    }
}

