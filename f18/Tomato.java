class Tomato implements IFruit, IVegetable {
    public boolean hasAPeel(){
        return true;
    }
    public boolean hasARoot(){
        return false;
    }

    public void details(){
        System.out.println("hasAPeel() : " + hasAPeel());
        System.out.println("hasARoot() : " + hasARoot());
    }
}

