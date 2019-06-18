class Main {
    public static void main(String[] args) {
        Display displayObject = new Display();
        Thread evenThread = new EvenThread(8, displayObject);
        Thread oddThread = new OddThread(8, displayObject);

        evenThread.start();
        oddThread.start();
    }

}
