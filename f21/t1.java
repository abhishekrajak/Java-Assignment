class t1 extends Thread {
    private int max;
    private DataObject dataObject;

    public t1(int max, DataObject dataObject){
        this.max = max;
        this.dataObject = dataObject;
    }
    public void run(){
        for(int i=0; i<max; i++){
            dataObject.generate(max);
	}
    }
}

