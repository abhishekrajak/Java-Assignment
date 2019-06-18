class EvenThread extends Thread{
    private int max;
    private Display display;

    public EvenThread(int max, Display display){
        this.max = max;
        this.display = display;
    }

    @Override
    public void run(){
        int num = 2;
        while(num<=max){
            display.displayEven(num);
            num+=2;
        }
    }
}
