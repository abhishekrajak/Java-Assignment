class Rectangle implements Shape{
        private double length;
	private double breadth;

        public void setLength(double length){
		this.length = length;
	}
	public double getLength(){
		return length;
	}
	public void setBreadth(double breadth){
		this.breadth = breadth;
	}
	public double getBreadth(){
		return breadth;
	}
        @Override
        public double area(){
                return length*breadth;
        }
        @Override
        public void move(){
		System.out.println("This is move function for Rectangle");
        }
        @Override
        public void rotate(){
		System.out.println("This is rotate function for Rectangle");
        }
        @Override
        public void draw(){
		System.out.println("This is draw function for Rectangle");
        }
}

