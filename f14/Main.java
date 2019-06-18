class Main {

    public static void main(String[] args) {
        Automobile object = new Automobile("ABC", "XYZ", 100, 250000, 45, 1999);
        object.details();

        System.out.println();

        Track object2 = new Track(object, 10, "MNO", 4);
        object2.details();

        System.out.println();

        Car object3 = new Car(object, 4, 4);
        object3.details();
    }
}

