class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread oddThread = new OddThread(100, data);
        Thread evenThread = new EvenThread(100, data);
        oddThread.setName("Thread 1");
        evenThread.setName("Thread 2");
        oddThread.start();
        evenThread.start();
    }
}

