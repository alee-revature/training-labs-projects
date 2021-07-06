/**
 * Unit Converter Application- Angela Lee
 * This Unit Converter Application is a menu-driven console applications that will let users convert between one type of unit and another.
 * It uses the Scanner for input and stores it in the value called menuSelection for the main menu. 
 * Users can enter input directly into the console.
 * 
 * There is another variable named secondMenuLayer for the secondary menus.
 * 
 * This program uses a while loop and switch case statement, and several methods.
 * It has 1 method to collect quantity, and several methods to convert the units. 
 * has 2 layers of menus.
 * 
 * First menu:
 * Please select an option: 
 * 1. Volume Conversions 
 * 2. Distance Conversions
 * 3. Quit
 * 
 * Secondary menus:
 * Volume Conversions: 
 * 1. Teaspoons to Tablespoons 
 * 2. Cups to Teaspoons 
 * 3. US Gallons to Imperial Gallons
 * 4. Quit
 * 
 * Distance Conversions: 
 * 1. Feet to Meters 
 * 2. Miles to Kilometers
 * 3. Quit
 */

package main;

import java.util.Scanner;

public class UnitConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please select an option: \n1. Volume Conversions \n2. Distance Conversions \n3. Quit");
		int menuSelection = scan.nextInt();
		
		while (menuSelection != 3) {
			if (menuSelection == 1) {
				System.out.println("Volume Conversions: \n1. Teaspoons to Tablespoons \n2. Cups to Teaspoons \n3. US Gallons to Imperial Gallons \n4. Quit");
				int secondMenuLayer = scan.nextInt();
				
					if (secondMenuLayer!= 4) {
					switch (secondMenuLayer) {
						case 1:
							//teaspoons to tablespoons
							double qty = collectQuantity("teaspoons");
							double tbsp = convertTspToTbsp(qty); 
							System.out.println(qty + " teaspoons " +  "converts to " + tbsp + " tablespoons");
							break;
						case 2:
							//cups to teaspoons
							qty = collectQuantity("cups");
							double tsp = convertCupsToTeaspoons(qty);
							System.out.println(qty + " cups" + " converts to " + tsp + " teaspoons");
							break;
						case 3:
							//US Gallons to Imperial Gallons
							qty = collectQuantity("US Gallons");
							double impGal = convertUSGallonsToImperial(qty);
							System.out.println(qty + " US gallons" + " converts to " + impGal + " imperial gallons");
							break;
						default:
							System.out.println("Error! Please try again");
					}
						System.out.println("Please select an option: \n1. Volume Conversions \n2. Distance Conversions \n3. Quit");
						secondMenuLayer = scan.nextInt();
					}
			}
			if (menuSelection == 2) {
				System.out.println("Distance Conversions: \n1. Feet to Meters \n2. Miles to Kilometers \n3. Quit");
				int secondMenuLayer = scan.nextInt();
				
				if (secondMenuLayer != 3) {
					switch (secondMenuLayer) {
						case 1:
							//feet to meters
							double qty = collectQuantity("feet");
							double m = convertFtToM(qty);
							System.out.println(qty + " feet " + " converts to " + m + " meters");
							break;
						case 2: 
							//miles to Kilometers
							qty = collectQuantity("miles");
							double km = convertMiToKm(qty);
							System.out.println(qty + " miles" + " converts to " + km + " kilometers");
							break;
						default:
							System.out.println("Error! Please try again");
					}
					System.out.println("Please select an option: \n1. Volume Conversions \n2. Distance Conversions \n3. Quit");
					secondMenuLayer = scan.nextInt();
				}
			}
			else {
				System.out.println("Exiting application");
			}
		}
		System.out.println("Exiting the application");
		scan.close();
		
	}
	
	private static double collectQuantity(String unit1) {
		double qty;
		System.out.println("Enter quantity of " + unit1);
		Scanner scan = new Scanner(System.in);
		qty = Double.parseDouble(scan.next());
			
		if (qty <= 0) {
			System.out.println("Error! Enter a quantity greater than 0");
		}
		return qty;
	}
	
	//Convert cups to teaspoons
	public static double convertCupsToTeaspoons(double cups) {
		double tsp = cups * 48;
		return tsp;
	}
	public static double convertMiToKm(double miles) {
		double km = miles * 1.60934;
		return km;
	}
	public static double convertUSGallonsToImperial(double usGal) {
		double impGal = usGal / 1.201;
		return impGal;
	}
	
	public static double convertTspToTbsp (double tsp) {
		double tbsp = tsp / 3;
		return tbsp;
	}
	
	public static double convertFtToM (double feet) {
		double m = feet / 3;
		return m;
	}
}