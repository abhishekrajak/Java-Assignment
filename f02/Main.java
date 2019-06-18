class Main{	
	public static void main(String[] args){
		Student object = new Student("Abhishek Rajak", 90, 93, 99);	
		object.display();
		System.out.println("sub_01 : " + object.getSubject_01());
		System.out.println("sub_02 : " + object.getSubject_02());
		System.out.println("sub_03 : " + object.getSubject_03());  
		System.out.println("Total Marks : " + object.getTotal());
	}
}
