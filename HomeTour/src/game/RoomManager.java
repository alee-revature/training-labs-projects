/*
 * The RoomManager class creates all of the Rooms in the house, establishes the exits, creates the Room Objects, and
 * adds those objects to the rooms.
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
	
	//Create all rooms, set exits, create other objects, and set object lists for those rooms at start of program execution
	public Room[] init() {
		
		// 1 - Create all Rooms
			Room room1 = new Room(
					"Foyer",
					"Room 1 - A small foyer",
					"Room 1 - The small entryway of a late 1960s townhome. "
					+ "To the left are some modern, newly renovated stairs with grey flooring. "
					+ "To the north is a closet. "
					+ "To the east is a pantry, where there is glassware and delicate teacups, as well as snacks.");
				this.rooms[0] = room1;
				
				Room room2 = new Room(
						"Pantry",
						"Room 2 - Warm wood pantry",
						"Room 2 - This golden wood pantry cabinet features racks of fine china, wine glasses, and tupperware.\r\n"
						+ "In between these sections is a drawer to pull out fruits, vegetables, and other snacks. "
						+ "In the lower cabinets, there are assorted dry goods such as pasta, cans, and snacks.\r\n"
						+ "The floor is tile. To the right, a window with light, airy curtains let in natural sunlight. \r\n"
						+ "Below is a black table where there are bags of rice stored underneath in an ice box. "
						+ "Next to that is a water dispenser where cold or hot water can be filled. Near that is a trash can.\r\n"
						+ " ");
					this.rooms[1] = room2;
				
				Room room3 = new Room(
						"Kitchen",
						"Room 3 - Cozy kitchen",
						"Room 3 - This galley kitchen with golden wood cabinets and brick wall has granite countertops which are parallel to each other. "
						+ "A cutting board sits next to a silver sink. The dishwasher is loaded with hand-washed dishes, cutlery and silverware utensils. "
						+ "There are pink gloves, and some aprons. A black gas stove with pots and pans and a hood above and oven is below. "
						+ "2 refrigerators are stocked full with food. ");
					this.rooms[2] = room3;
					
					Room room4 = new Room(
							"Bathroom",
							"Room 4 - Mermaid-esque bathroom",
							"Room 4 - The bathroom features mint or sage green walls. Ahead is a golden filigree mirror.\r\n"
							+ "Below is a monochromatic black and white rug. On the white sink is some soap, toothpaste, toothbrush, toilet paper and toiletries.\r\n"
							+ "To the left is a towel.\r\n"
							+ "");
						this.rooms[3] = room4;
						
						Room room5 = new Room(
								"Dining Room",
								"Room 5 - Dining Room",
								"Room 5 - The floor transitions from tile to warm laminate flooring. "
								+ "An oval glass table sits in between 5 dark cushioned wooden chairs. Above is a silver chandelier with bright, warm light bulbs.\r\n"
								+ "On the table are plates with freshly made home cooked food and cups of water and tea.\r\n" + ""
								+ "");
							this.rooms[4] = room5;
							
							Room room6 = new Room(
									"Living Room",
									"Room 6 - Living Room",
									"Room 6 - A large leather sofa and loveseat with a mahogany coffee table full of books and papers face a thin TV. "
									+ "A bright red floral painting hangs on the wall."
									+ "");
								this.rooms[5] = room6;
								
								Room room7 = new Room(
										"Basement entryway",
										"Room 7 - Basement entryway",
										"Room 7 - The basement is colder than the rest of the house by 10 degrees.\r\n"
										+ "As you go down the stairs, you see a shelf of power tools: hammer, screwdriver, etc.\r\n"
										+ "To the left is a bookshelf full of files and journals. To the left of the bookshelf is a small bathroom.\r\n"
										+ "");
									this.rooms[6] = room7;
								
									Room room8 = new Room(
											"Basement",
											"Room 7 - Basement",
											"Room 7 - The basement is lively in the summertime.The floor is brand new, plush carpet.\r\n"
													+ "Colorful striped futon to entertain guests. Brown wooden upright piano with some sheet music.\r\n"
													+ "Brick wall with fireplace to cook yams in the colder months\r\n"
													+ "Large, rectangular white mirror leaning against the wall with bright pink and blue yoga mats\r\n"
													+ "Glass sliding balcony door leading out to backyard\r\n"
													+ "Bookshelves full of children’s books, dollhouses and toys.\r\n" + "");
										this.rooms[7] = room8;
										
										Room room9 = new Room(
												"Bedroom",
												"Room  - Bedroom",
												"Room 7 - A bed with a lilac headframe, floral quilt blanket, patterned throw pillows and plushies lay against "
												+ "freshly painted white walls next to a window with lilac curtains. \r\n"
												+ "Study area with desk and dual monitor setup. A persian floor mini rug muffles the "
												+ "sound of the rolling chair. A bookshelf with textbooks and a plant. A closet with dresses "
												+ "and bags. A dresser with butterflies and lilac marble and silver dresser knobs hold clothes.\r\n"
												+ "");
											this.rooms[8] = room9;
											
											Room room10 = new Room(
													"Bedroom",
													"Room  - Bathroom",
													"Room 7 - A newly renovated shower and bathtub is surrounded by tiles\r\n"
													+ "Shampoo, conditioner, and leave in mask with other toiletries\r\n"
													+ "The floor features a flowery rug.\r\n"
													+ "\r\n"
													+ "");
												this.rooms[9] = room10;
												
												Room room11 = new Room(
														"Bedroom",
														"Room  - Backyard",
														"Room 7 - A newly done wooden patio features a large backyard with a barn-like shed and garden with flowers and vegetables."
														+ "You can often see bunnies hopping happily in the yard. Squirrels enjoy visiting and climbing the trees nearby.\r\n"
														+ "");
													this.rooms[9] = room11;
													
		
		// 2 - Set Exits
		//Room[] room1Exits = {"north", "east", "south", "west"};
		//room1.setExits(room1Exits);
		
		// 3 - Create Objects 
		
		//4 - Set item list for Rooms (note, we used a VarArgs for the setItems method in the Room Class
		
		// 5 - Set Starting Room
		this.startingRoom = room1;
		//this.rooms[0] = room1;
		
		//public Room getStartingRoom() { return this.startingRoom; }
		//public void setStartingRoom(Room startingRoom) { this.startingRoom = startingRoom; }
	
		//public Room[] getRooms() { return this.rooms; }
		//public void setRooms(Room[] rooms) { this.rooms = rooms; }
		
		return rooms;
	}

	/*public Room getStartingRoom() {
		return this.startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}*/
}
