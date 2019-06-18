class Track extends Automobile{
    private int capacity;
    private String hoodType;
    private int noOfWheels;

    public Track(){
        super();
        capacity = 0;
        hoodType = "default_hood_type";
        noOfWheels = 0;
    }
    public Track(String make, String type, float maxSpeed, float price, float mileage, int registrationNumber, int capacity, String hoodType, int noOfWheels){
        super(make, type, maxSpeed, price, mileage, registrationNumber);
        this.capacity = capacity;
        this.hoodType = hoodType;
        this.noOfWheels = noOfWheels;
    }
    public Track(Automobile object, int capacity, String hoodType, int noOfWheels){
        this(object.getMake(), object.getType(), object.getMaxSpeed(), object.getPrice(), object.getMileage(), object.getRegistrationNumber(), capacity, hoodType, noOfWheels);
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHoodType() {
        return hoodType;
    }

    public void setHoodType(String hoodType) {
        this.hoodType = hoodType;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public void details(){
        super.details();
        System.out.printf("Capacity : %d\nHood Type : %s\n# of wheels : %d\n", capacity, hoodType, noOfWheels);
    }
}

