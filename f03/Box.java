class Box {
    private double height;
    private double width;
    private double breadth;
    public Box(){
        this(0, 0, 0);
    }
    public Box(int height, int width, int breadth){
        this((double)height, (double)width, (double)breadth);
    }
    public Box(double height, double width, double breadth){
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    public double getArea(){
        return 2*(height*width+height*breadth+breadth*width);
    }
    public double getVolume(){
        return height*width*breadth;
    }
}
