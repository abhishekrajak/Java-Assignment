import java.util.ArrayList;

class Consumer extends Thread {
    private ArrayList<Integer> buffer;
    private Integer sum = 0;

    public Consumer(ArrayList<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(Integer.valueOf(-1))) {
                    break;
                }
                else {
                    sum += buffer.get(0);
                    System.out.println("value read " + buffer.get(0));
                    buffer.remove(0);
                    System.out.println("sum : " + sum + "\n");
                }
            }
        }
    }
}
