class Circle implements Shape{
	private double radius;
	public static double pi = 22.0/7.0;
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	@Override
	public double area(){
		return pi*radius*radius;
	}
	@Override
	public void move(){
		System.out.println("This is move function for Circle");		
	}
	@Override
	public void rotate(){
		System.out.println("This is rotate function for Circle");
	}
	@Override 
	public void draw(){
		System.out.println("This is draw function for Circle");
	}
}
