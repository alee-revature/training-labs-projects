package loops;
public class WhileLoops {

	public static void main(String[] args) {
		boolean on = true;
		
		while(on) {
			System.out.println("Inside the while loop");
			/* using loops, be sure that your 
			code at some point changes the condition, 
			so that your program won't stall.*/
			on = false;
			
		}

	}

}
