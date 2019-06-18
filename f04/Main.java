class Main {

    public static void main(String[] args) {
        Stack object = new Stack(30);

        object.push(10);
        object.push(20);
        object.push(30);
        object.push(15);
        object.push(9);

        object.print();

        object.pop();
        object.pop();
        object.pop();

        object.print();

    }
}

