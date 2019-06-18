class Main {

    public static void main(String[] args) {
        Box object_01 = new Box(10, 20, 30);
        Box object_02 = new Box(40, 50, 60);
        System.out.println("For Box 01 Area : " + object_01.getArea() + " Volume : " + object_01.getVolume());
        System.out.println("For Box 02 Area : " + object_02.getArea() + " Volume : " + object_02.getVolume());
    }
}

