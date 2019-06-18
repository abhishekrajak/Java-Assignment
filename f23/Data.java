class Data {
    private int i = 0;
    private int sum = 0;
    boolean condition = false;

    public synchronized void oddSum(){
        while(condition){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Exception on oddSum()");
            }
        }
        sum+=(++i);
        condition = true;
        System.out.println("Added " + i + " on " + Thread.currentThread().getName());
        System.out.println("Sum : " + sum);
        notify();
    }

    public synchronized void evenSum(){
        while(!condition){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Exception of evenSum()");
            }
        }
        condition = false;
        sum+=(++i);
        System.out.println("Added " + i + " on " + Thread.currentThread().getName());
        System.out.println("Sum : " + sum);
        notify();
    }
}

