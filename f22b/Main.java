import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        ReentrantLock bufferLock = new ReentrantLock();
        Producer producer = new Producer(buffer, bufferLock, "file.txt");
        Consumer consumer = new Consumer(buffer, bufferLock);
        producer.start();
        consumer.start();
    }
}
