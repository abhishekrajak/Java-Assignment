class Automobile {
    private String make;
    private String type;
    private float maxSpeed;
    private float price;
    private float mileage;
    private int registrationNumber;

    public Automobile(){
        this("default_make", "default_type", 0, 0, 0, 0);
    }
    public Automobile(String make, String type, float maxSpeed, float price, float mileage, int registrationNumber) {
        this.make = make;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.mileage = mileage;
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void details(){
        System.out.printf("Make : %s\nType : %s\nMax Speed : %.2f kmph\nPrice : Rs.%.2f\nMileage : %.2f kmpl\nRegistration # : %d\n", make, type, maxSpeed, price, mileage, registrationNumber);
    }

}

