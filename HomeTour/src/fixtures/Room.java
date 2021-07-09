package fixtures;

public class Room extends Fixture {
	/*
	 * exits is a list of the 'adjacent' rooms...Here, all rooms will have an array that can hold 4 references.
	 * This number is arbitrary, and is used to associate the cardinal directions. 
	 */
	private Room[] exits = new Room[4];
	
	//This array is a collection of the items in the room
	//private Fixture[] items;
	
	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		this.exits = new Room[10];
	}
	
	public Room[] getExits() {
		return exits;
	}

	public Room[] getExit(String direction) {
		return exits;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	// Overloaded setter method - can set single exit based on index
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	/*
	//Getter and Setter for Fixtures
	public Fixture[] getItems() {
		return items;
	}

	/*public void setItems(Fixture[] items) {
		this.items = items;
	}*/
	
	//The setter method here uses VarArgs simply for ease of use
	/*
	public void setItems(Fixture... items) {
		this.items = items;
	}*/
}

