import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

class Consumer extends Thread {
    private ArrayList<Integer> buffer;
    private ReentrantLock bufferLock;
    private Integer sum = 0;

    public Consumer(ArrayList<Integer> buffer, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        int counter = 0;
        boolean emptyBuffer = false;
        boolean cond = true;
        while (true) {
            if(bufferLock.tryLock()) {
                try {
                    if (buffer.isEmpty()) {
                        emptyBuffer = true;
                        continue;
                    }
                    if (buffer.get(0).equals(Integer.valueOf(-1))) {
                        break;
                    } else {
                        sum += buffer.get(0);
                        System.out.println("value read " + buffer.get(0));
                        buffer.remove(0);
                        System.out.println("sum : " + sum + "\n");
                    }
                }finally {
                    bufferLock.unlock();
                    if(emptyBuffer){
                        try{
                            sleep(500);
                            counter++;
                        }catch (InterruptedException e){
				System.out.println("Consumer on sleep is interrupted");
                        }finally {
                            emptyBuffer = false;
                        }
                    }
                    if(counter>5){
                        cond = false;
                        break;
                    }
                }
            }
        }
    }
}
