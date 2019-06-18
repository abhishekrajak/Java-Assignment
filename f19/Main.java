class Main {

    public static void main(String[] args) {
        ChildThread object = new ChildThread();
        System.out.println("In main thread");
        object.start();
    }

}

