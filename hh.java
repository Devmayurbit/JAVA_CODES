import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

    private static final int BUFFER_SIZE = 5;
    private static final BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(BUFFER_SIZE);

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    int item = (int) (Math.random() * 100); // Produce a random item
                    buffer.put(item); // Put item in the buffer
                    System.out.println("Producer produced: " + item);
                    Thread.sleep((int) (Math.random() * 1000)); // Simulate production time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Producer was interrupted");
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    int item = buffer.take(); // Get item from the buffer
                    System.out.println("Consumer consumed: " + item);
                    Thread.sleep((int) (Math.random() * 1000)); // Simulate consumption time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Consumer was interrupted");
                }
            }
        }
    }
}