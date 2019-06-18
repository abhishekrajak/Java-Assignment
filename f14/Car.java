class Car extends Automobile{
    private int noOfDoors;
    private int seatingCapacity;

    public Car(){
        super();
    }

    public Car(String make, String type, float maxSpeed, float price, float mileage, int registrationNumber, int noOfDoors, int seatingCapacity){
        super(make, type, maxSpeed, price, mileage, registrationNumber);
        this.noOfDoors = noOfDoors;
        this.seatingCapacity = seatingCapacity;
    }

    public Car(Automobile object, int noOfDoors, int seatingCapacity){
        this(object.getMake(), object.getType(), object.getMaxSpeed(), object.getPrice(), object.getMileage(), object.getRegistrationNumber(), noOfDoors, seatingCapacity);
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void details(){
        super.details();
        System.out.printf("# of doors : %d\nSeating Capacity : %d\n", noOfDoors, seatingCapacity);
    }
}

