package fixtures;

public class Room extends Fixture {
	//exits- adjacent rooms
	private Room[] exits = new Room[4];
	
	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		//this.exits = new Room[10];
	}
	//getters and setters for exits
	public Room[] getExits() {
		return exits;
	}
	
	public void setExits(Room[] room1Exits) {
		this.exits = exits;
	}
}