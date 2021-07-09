package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	private static RoomManager rm = new RoomManager(12);
	private static boolean running = true;
	
	public static void main(String[] args) {
		rm.init();	// Instantiate house
		
		Player player = new Player(); //Create the player 

		printInstructions(); // Print instructions to play the game
		
		player.setCurrentRoom(rm.getStartingRoom()); // Player starts in the 'starting room'
		
		if (running) {
		//Print the player's location and ask for input
			printRoom(player);
		}
	}

		public static void printRoom(Player player) {
			System.out.println("\n:::: CURRENT ROOM ::::");
			System.out.println("Name: " + player.getCurrentRoom().getName());
			System.out.println("Short Description: " + player.getCurrentRoom().getShortDesc());
			System.out.println("Long Description: " + player.getCurrentRoom().getLongDesc());
			printRoomExits(player);
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			parseInput(input);
			
			//player.setCurrentRoom(rm.());
		}
		public static void printInstructions() {
			System.out.println("Welcome to my house!"
					+ "\n\n Game Instructions: "
					+ "\n Type in commands and a direction to explore each room in the house"
					+ "\n Press move and a direction (North, South, East, or West) to change the direction of the room"
					+ "\n Enter in the command and a direction to exit the room and look at another room"
					+ "\n Enter LEAVE to exit game");
		}
		
		//Move the player to a new Room. Can put this directly within the parse method
		public static void printRoomExits(Player player) {
			System.out.println("\nAdjacent Rooms ");
			System.out.println("North: " + rm.getRooms()[1].getShortDesc());
			System.out.println("South: " + rm.getRooms()[2].getShortDesc());
			System.out.println("East: " + rm.getRooms()[3].getShortDesc());
			System.out.println("West: " + rm.getRooms()[4].getShortDesc());
		}
		
		public static void parseInput(String input) {
			String [] words = input.split(" ");
			String command = words[0];
			String direction = words[1];
			System.out.println("You try to " + command + " " + direction);
			
			if (command.equals("LEAVE")) {
				endGame();
			}
		}
		
		public static void endGame() {
			running = false;
			System.out.println("Thank you for playing! Hope to see you again!");
		}
	}