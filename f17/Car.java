class Car {
    private boolean willPay;

    public Car(){
        this(true);
    }
    public Car(boolean willPay){
        this.willPay = willPay;
    }

    public boolean willCarPay() {
        return willPay;
    }

    public void setWillPay(boolean willPay) {
        this.willPay = willPay;
    }
}

