import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Producer extends Thread{
    private ArrayList<Integer> buffer;
    private String fileName;

    public Producer(ArrayList<Integer> buffer, String fileName){
        this.buffer = buffer;
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
            synchronized (buffer) {
                buffer.add(Integer.valueOf(scanner.nextInt()));
            }
        }
        synchronized (buffer) {
            buffer.add(Integer.valueOf(-1));
        }

        scanner.close();

    }
}

