class Room{
	private float height;
	private float width;
	private float breadth;
	public Room(){
		this(0, 0, 0);
	}
	public Room(float height, float width, float breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	public Room(final Room object){
		this(object.getHeight(), object.getBreadth(), object.getWidth());
	}
	public float getHeight(){
		return height;
	}
	public float getWidth(){
		return width;
	}
	public float getBreadth(){
		return breadth;
	}
	public void setHeight(float x){
		height = x;
	}
	public void setWidth(float y){
		width = y;
	}
	public void setBreadth(float z){
		breadth = z;
	}
	public float volume(){
		return height*width*breadth;
	}
}
