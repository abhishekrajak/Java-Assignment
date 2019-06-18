class Display {
    private boolean isOdd;
    public synchronized void displayEven(int num){
        while(!isOdd){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(num);
        isOdd = false;
        notify();
    }
    public synchronized void displayOdd(int num){
        while(isOdd){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(num);
        isOdd = true;
        notify();
    }
}

