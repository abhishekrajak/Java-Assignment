class t2 extends Thread{
    int max;
    private DataObject dataObject;

    public t2(int max, DataObject dataObject){
        this.max = max;
        this.dataObject = dataObject;
    }

    public void run(){
        for(int i=0; i<max; i++){
            dataObject.calculate();
        }
    }
}

