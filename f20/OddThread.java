class OddThread extends Thread {
    private int max;
    private Display display;

    public OddThread(int max, Display display){
        this.max = max;
        this.display = display;
    }

    @Override
    public void run(){
        int num = 1;
        while(num<=max){
            display.displayOdd(num);
            num+=2;
        }
    }
}
