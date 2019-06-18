class Main {

    public static void main(String[] args) {
        Date object = new Date(31, 12, 2004);
        object.display();
        object.previous().display();
        object.next().display();
    }
}
