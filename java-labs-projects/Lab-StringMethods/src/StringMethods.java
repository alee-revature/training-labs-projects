
public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello";
		/*equals() method compares the literal value "Hello" to String variable str
		 * use dot operator . a period followed by the name of the method that you use after
		 * a class or reference
		 */
		System.out.println(str.equals("Hello"));
		
		/*length() used to return the size of the associated String accepting 0 parameters
		 * returns an int while representing the length(number of characters) of the String
		*/
		//use the length method
		System.out.println(str.length());
		
		/*
		 * indexOf() returns index (zero-based) of the specified character. It specifies
		 * an argument that is single character and returns an int.
		 * If the character is not within the String, then it will return -1.
		 * Several overloaded forms of indexOf method avaialbel
		 */
		System.out.println(str.indexOf("H"));
	}

}
