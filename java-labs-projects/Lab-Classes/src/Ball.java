/**
 * This class conceptualizes a toy ball and identifies properties (size and color)
 * and behavior (bounce) of a real-world ball.
 */
public class Ball {
	//Define any properties at the top of the class and any methods below that
	String size;
	String color;
	
	//Define behavior
	public void bounce() {
		System.out.println("The " + size + " " + color + " ball is bouncing.");
	}
	
	/*Create an instance of a class by using new keyword followed by a call to a constructor
	*new Ball() by itself creates a new instances of a Ball object but isn't useful 
	*because we need to keep track of a reference to the object
	*So, we need to assign a new variable to our project
	*A reference variable is much like how you create a primitive variable, 
	*but reference variables always refer to objects (instances of classes) rather than primitives
	*/
	public static void main(String[] args) {
		Ball b1 = new Ball();
		Ball b2 = new Ball();
		
		//assign initial state to the Ball instances
		b1.size = "big";
		b1.color = "red";
		b2.size = "small";
		b2.color = "blue";
		
		//invoke the bounce method
		b1.bounce();
		b2.bounce();
	}
}
