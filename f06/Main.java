class Main {

    public static void main(String[] args) {
        ComplexNumber object = new ComplexNumber(3, 2);
        ComplexNumber object2 = new ComplexNumber(4, -2);
        object.display();
        object2.display();
        ComplexNumber object3 = object.sum(object2);
        object3.display();
        ComplexNumber object4 = object.product(object2);
        object4.display();

    }
}

