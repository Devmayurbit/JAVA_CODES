import java.util.BitSet;

public class bitSet {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(4);
        bitSet.set(6);
        bitSet.set(8);

        BitSet bitSet2 = new BitSet();
        bitSet2.set(1);
        bitSet2.set(2);
        bitSet2.set(3);
        bitSet2.set(4);
        bitSet2.set(5);
        bitSet2.set(6);
        bitSet2.set(7);

        bitSet.and(bitSet2); // AND operation
        System.out.println("After AND operation: " + bitSet);
    }
}
