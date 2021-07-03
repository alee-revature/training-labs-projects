import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Print a line to the console to prompt the user for input
		System.out.println("Please type in a line and hit enter");
		
		//Grab the entire line; next() causes each word to be considered separately
		String line = scanner.nextLine();
		System.out.println("You have typed: " + line);
		
		//Close resources when no longer needed within your program
		scanner.close();
		
		String numbers = "1 2 3 5 7 9";
		scanner = new Scanner(numbers);
		
		//While loop to iterate over the different tokens that the scanner will find within the String
		//Token is parsed input.. each value separated by spaces is a token
		
		while(scanner.hasNextInt()) {
			//Here it is System.out.print, not System.out.print.line
			System.out.print(scanner.nextInt());
		}
		scanner.close();
	}

}
