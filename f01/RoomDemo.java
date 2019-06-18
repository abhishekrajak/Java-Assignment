class RoomDemo{
	private Room object;
	public RoomDemo(){
		object = new Room(0, 0, 0);
	}
	public RoomDemo(float height, float width, float breadth){
		object = new Room(height, width, breadth);
	}
	public RoomDemo(final Room object){
		this.object = new Room(object);
	}
	public Room getRoom(){
		return this.object;
	}
	public void setRoom(final Room object){
		this.object = object;
	}
	public void showRoomDemo(){
		System.out.println("The volume of the room is " + object.volume());
	}
}
