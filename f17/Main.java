class Main {

    public static void main(String[] args) {
        Car[] willPayCars = new Car[10];
        for(int i=0; i<10; i++){
            willPayCars[i] = new Car(true);
        }

        Car[] willNotPayCars = new Car[15];
        for(int i=0; i<15; i++){
            willNotPayCars[i] = new Car(false);
        }

        TollBooth booth = new TollBooth(50);
        for(int i=0; i<10; i++){
            booth.passCar(willPayCars[i]);
        }
        for(int i=0; i<15; i++){
            booth.passCar(willNotPayCars[i]);
        }
        booth.details();
    }
}

