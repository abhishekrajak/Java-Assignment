class TollBooth {
    private double tollTax;
    private int carsNotPaid;
    private int totalCars;
    private double totalCollection;

    public TollBooth(){
        this(50);
    }
    public TollBooth(double tollTax){
        this.tollTax = tollTax;
        this.carsNotPaid = 0;
        this.totalCars = 0;
        this.totalCollection = 0;
    }

    public double getTollTax() {
        return tollTax;
    }

    public void setTollTax(double tollTax) {
        this.tollTax = tollTax;
    }

    public double getTotalCollection() {
        return totalCollection;
    }

    public int getCarsNotPaid() {
        return carsNotPaid;
    }

    public int getTotalCars() {
        return totalCars;
    }

    public void passCar(final Car object){
        totalCars++;
        if(object.willCarPay()==true){
            totalCollection+=tollTax;
        }
        else{
            carsNotPaid++;
        }
    }

    public void details(){
        System.out.printf("# of cars without paying : %d\n# of cars passed by : %d\ntotal amount collected : Rs.%.2f\n", carsNotPaid, totalCars, totalCollection);
    }

}

