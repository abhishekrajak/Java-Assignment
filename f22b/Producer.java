import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Producer extends Thread{
    private ArrayList<Integer> buffer;
    private ReentrantLock bufferLock;
    private String fileName;

    public Producer(ArrayList<Integer> buffer, ReentrantLock bufferLock, String fileName){
        this.buffer = buffer;
        this.bufferLock = bufferLock;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Scanner scanner = null;
        while(true) {
            try {
                scanner = new Scanner(new FileReader(fileName));
                break;
            } catch (Exception e) {
                System.out.printf("Error occured enter fileName again : ");
                fileName = new Scanner(System.in).nextLine();
            }
        }

        while (scanner.hasNextInt()) {
            bufferLock.lock();
            try {
                buffer.add(Integer.valueOf(scanner.nextInt()));
            }finally {
                bufferLock.unlock();
            }

        }

        bufferLock.lock();
        try{
           /*
 	    *  buffer.add(Integer.valueOf(-1));
           */	
	}finally {
            bufferLock.unlock();
        }

        scanner.close();

    }
}

