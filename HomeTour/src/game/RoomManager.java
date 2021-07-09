/* The RoomManager class creates all of the Rooms in the house, establishes the exits, creates the Room Objects, and adds those objects to the rooms.
 */

package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	private Room[] rooms;

	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	
	public Room[] init() {
		// 1 - Create all Rooms
			Room room1 = new Room(
					"Foyer",
					"A small foyer",
					"The small entryway of a late 1960s townhouse in the suburbs of Washington DC. "
					+ "\nTo the west are some modern, newly renovated stairs with grey flooring. "
					+ "\nTo the north is a bathroom. "
					+ "\nTo the east is a pantry, where there is glassware and delicate teacups, as well as snacks.");
				this.rooms[0] = room1;
				
				Room room2 = new Room(
						"Stairs",
						"A modern staircase",
						"A modern staircase with grey wood flooring. "
						+ "\nTo the west are some modern, newly renovated stairs with grey flooring. "
						+ "\nTo the north is a bathroom. "
						+ "\nTo the east is a pantry, where there is glassware and delicate teacups, as well as snacks.");
					this.rooms[1] = room2;
				
			Room room3 = new Room(
					"Pantry",
					"Warm wood pantry",
					"This golden wood pantry cabinet features racks of fine china, wine glasses, and tupperware."
					+ "\nIn between these sections is a drawer to pull out fruits, vegetables, and other snacks. "
					+ "\nIn the lower cabinets, there are assorted dry goods such as pasta, cans, and snacks."
					+ "\nThe floor is tile. To the right, a window with light, airy curtains let in natural sunlight."
					+ "\nBelow is a black table where there are bags of rice stored underneath in an ice box. "
					+ "\nNext to that is a water dispenser where cold or hot water can be filled. Near that is a trash can.");
					this.rooms[2] = room3;
				
			Room room4 = new Room(
					"Kitchen",
					"Cozy kitchen",
					"This galley kitchen with golden wood cabinets and brick wall has granite countertops which are parallel to each other. "
					+ "\nA cutting board sits next to a silver sink. The dishwasher is loaded with hand-washed dishes, cutlery and silverware utensils. "
					+ "\nThere are pink gloves, and some aprons. A black gas stove with pots and pans and a hood above and oven is below. "
					+ "\n2 refrigerators are stocked full with food.");
					this.rooms[3] = room4;
					
			Room room5 = new Room(
					"Bathroom",
					"Mermaid-esque bathroom",
					"\nThe bathroom features mint or sage green walls. Ahead is a golden filigree mirror."
					+ "\nBelow is a monochromatic black and white rug. On the white sink is some soap, toothpaste, toothbrush, toilet paper and toiletries."
					+ "\nTo the left is a towel.");
					this.rooms[4] = room5;
						
			Room room6 = new Room(
					"Dining Room",
					"Dining Room",
					"The floor transitions from tile to warm laminate flooring. "
					+ "\nAn oval glass table sits in between 5 dark cushioned wooden chairs. Above is a silver chandelier with bright, warm light bulbs."
					+ "\nOn the table are plates with freshly made home cooked food and cups of water and tea.");
					this.rooms[5] = room6;
							
			Room room7 = new Room(
					"Living Room",
					"Small living room",
					"A large leather sofa and loveseat with a mahogany coffee table full of books and papers face a TV. "
					+ "\nA bright red floral painting hangs on the wall.");
					this.rooms[6] = room7;
								
			Room room8 = new Room(
					"Basement entryway",
					"Small basement entryway",
					"The basement is colder than the rest of the house by 10 degrees.\r\n"
					+ "\nAs you go down the stairs, you see a shelf of power tools: hammer, screwdriver, etc."
					+ "\nTo the left is a bookshelf full of files and journals. To the left of the bookshelf is a small bathroom.");
					this.rooms[7] = room8;
								
			Room room9 = new Room(
					"Basement",
					"Lively basement",
					"The basement is lively in the summertime.The floor is brand new, plush carpet."
					+ "Colorful striped futon to entertain guests. Brown wooden upright piano with some sheet music."
					+ "\nBrick wall with fireplace to cook yams in the colder months"
					+ "\nLarge, rectangular white mirror leaning against the wall with bright pink and blue yoga mats"
					+ "\nGlass sliding balcony door leading out to backyard"
					+ "\nBookshelves full of children’s books, dollhouses and toys.");
					this.rooms[8] = room9;
										
			Room room10 = new Room(
					"Bedroom",
					"Girl Bedroom",
					"A bed with a lilac headframe, floral quilt blanket, patterned throw pillows and plushies lay against "
					+ "\nfreshly painted white walls next to a window with lilac curtains. "
					+ "\nStudy area with desk and dual monitor setup. A persian floor mini rug muffles the "
					+ "\nsound of the rolling chair. A bookshelf with textbooks and a plant. A closet with dresses "
					+ "\nand bags. A dresser with butterflies and lilac marble and silver dresser knobs hold clothes.");
					this.rooms[9] = room10;
											
			Room room11 = new Room(
					"Upstairs bathroom",
					"Upstairs bathroom",
					"A newly renovated shower and bathtub is surrounded by tiles"
					+ "Shampoo, conditioner, and leave in mask with other toiletries"
					+ "The floor features a flowery rug.");
					this.rooms[10] = room11;
												
			Room room12 = new Room(
					"Backyard",
					"Backyard and Patio",
					"A newly done wooden patio features a large backyard with a barn-like shed and garden with flowers and vegetables."
					+ "You can often see bunnies hopping happily in the yard. Squirrels enjoy visiting and climbing the trees nearby.");
					this.rooms[11] = room12;
													
		// 2 - Set Exits
					
		Room[] room1Exits = {room2, room3, room4, room5};
		room1.setExits(room1Exits);
					
		
		// 3 - Create Objects 
		
		//4 - Set item list for Rooms (note, we used a VarArgs for the setItems method in the Room Class
		
		// 5 - Set Starting Room
		this.startingRoom = room1;
		return rooms;
	}

	public Room getStartingRoom() { return this.startingRoom; }
	public void setStartingRoom(Room startingRoom) { this.startingRoom = startingRoom; }
	
	public Room[] getRooms() {
		return this.rooms;
	}
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}