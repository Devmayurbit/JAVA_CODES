@SuppressWarnings("unchecked")
class MyArray<T extends Number> {
    T A[] = (T[]) new Object[10]; // Unsafe cast but suppressed
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        MyArray<Double> ma = new MyArray<>();
        
        ma.append(12.5);
        ma.append(6.57);
        ma.append(9.75);

        ma.display();
    }
}
