class OddThread extends Thread {
    private int max;
    private Data data;

    public OddThread(int max, Data data){
        this.max = max;
        this.data = data;
    }
    @Override
    public void run(){
        for(int i=1; i<=max; i+=2){
            data.oddSum();
        }
    }
}

