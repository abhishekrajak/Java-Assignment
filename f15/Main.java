class Main{
	public static void main(String args[]){
		Circle object = new Circle();
		object.setRadius(10);
		System.out.printf("The radius is %.2f and area is %.2f\n", object.getRadius(), object.area());

		Rectangle object2 = new Rectangle();	
		object2.setLength(5);
		object2.setBreadth(6);
		System.out.printf("length : %.2f breadth : %.2f area : %.2f\n", object2.getLength(), object2.getBreadth(), object2.area());
	}
}
