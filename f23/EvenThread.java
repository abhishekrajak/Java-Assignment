class EvenThread extends Thread {
    private int max;
    Data data;

    public EvenThread(int max, Data data){
        this.max = max;
        this.data = data;
    }
    @Override
    public void run(){
        for(int i=2; i<=max; i+=2){
            data.evenSum();
        }
    }
}

