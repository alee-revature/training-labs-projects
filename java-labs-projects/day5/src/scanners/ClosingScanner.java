package scanners;

import java.util.Scanner;

public class ClosingScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me input");
		String value = scan.next();
		System.out.println(value);
		/*
		 * When closing a scanner, we do not close the
		 * Scanner object, we close the resource associated 
		 * with the scanner, in this case, we would close
		 * the static inputStream of our System class
		 */
		
		int number = scan.nextInt();
		System.out.println(number);
		
		scan.close(); // Make sure to close the scanner at the end
	}

}
