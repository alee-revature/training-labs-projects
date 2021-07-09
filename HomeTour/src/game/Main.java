package game;

import java.util.Scanner;

public class Main {
	private static RoomManager rm = new RoomManager(10);
	private static boolean running = true;
	
	public static void main(String[] args) {
		rm.init();	// Instantiate house
		
		Player player = new Player(); //Create the player 
		
		printInstructions(); // Print instructions to play the game
		Scanner sc = new Scanner(System.in);
		//player.setCurrentRoom(rm.getStartingRoom()); // Player starts in the 'starting room'
		
		//Print the player's location and ask for input
		while (running) {
			printRoom(player);
			String[] input = collectInput();
			parse(input, player);
		}
	}

		public static void printRoom(Player player) {
			System.out.println(":::: CURRENT ROOM ::::");
			System.out.println("Name: " + player.getCurrentRoom().getName());
			System.out.println("Short Desc: " + player.getCurrentRoom().getShortDesc());
			System.out.println("Long Desc: " + player.getCurrentRoom().getLongDesc());
			printRoomExits(player);
			//printInteractableObjects(player.getCurrentRoom());
		}
		public static void printInstructions() {
			System.out.println("Welcome to my house! Glad to see you're here. "
					+ "\n Type in commands and a direction to explore each room in the house"
					+ "\n\n Go: Enter a room"
					+ "\n Move: Enter a room"
					+ "\n QUIT: Exit game"
					+ "\n\n Enter in the command and a direction to exit the room and look at another room");
		}
		
		private static String[] collectInput() {
			return null;
		}
		private static void parse(String[] command, Player player) {
			//'action' includes moving the player, interacting with an object and quitting
			String action = command[0].toUpperCase().intern();
			
			// 'details'- more options for the specific commands. Initially set to null, as player may enter more commands
			String details = null;
			
			if (command.length > 1) {
				details = command[1].toUpperCase().intern();
			}

			if (action == "GO" | action == "MOVE") { // What to do when the 'action' specified is to move
				
			} else if (action == "INTERACT") { // What to do when the 'action' specified is to interact
				System.out.println("Picking up object");
			} else if (action == "QUIT") {
				endGame();
			}
		}
		
		public static void printRoomExits(Player player) {
			
		}
		
		//Move the player to a new Room. Can put this directly within the parse method
		public static void movePlayer(String details, Player player) {
			
		}
		
		//Let player interact with objects in a Room that implement the 'Interactable' interface. Can put this logic directly within the parse method
		/*public static void objectInteraction(String details, Player player) {
			
		}*/
		public static void endGame() {
			running = false;
			System.out.println("Thank you for playing! Hope to see you again!");
		}
	}