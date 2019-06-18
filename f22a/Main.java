import java.io.IOException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        Producer producer = new Producer(buffer, "file.txt");
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}

