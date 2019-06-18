class DataObject {
    boolean cond;
    double sum;
    double factorial;
    int currentVal;
    
    public DataObject(){
        sum = 0;
        factorial = 1;
        currentVal = 0;
    }

    public synchronized void generate(int max){
        while(cond){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        if(currentVal==0||currentVal==1){
            factorial = 1;
        }
        else{
            factorial*=(double)currentVal;
        }
        cond = true;
	currentVal++;
	if(currentVal==max){
		System.out.printf("%s%.10f\n", "The sum : ", sum);
 	}
        notify();
    }

    public synchronized void calculate(){
        while(!cond){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        sum+=(1/factorial);
        cond = false;
        notify();
    }
}

