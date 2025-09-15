import java.lang.reflect.Array;

class MyArray<T extends Number> {
    T A[];
    int length = 0;

    @SuppressWarnings("unchecked")
    public MyArray(Class<T> clazz, int size) {
        // Create an array of the correct type at runtime
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

public class genericbounds {
    public static void main(String[] args) {
        // Create a Double array
        MyArray<Double> ma = new MyArray<>(Double.class, 10);

        ma.append(12.5);
        ma.append(6.57);
        ma.append(9.75);

        ma.display();
    }
}
