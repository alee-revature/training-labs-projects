package methods;

public class OverloadedMethods {

	public static void main(String[] args) {
		//Create instance here
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		om.print("second print method");
		om.print("second", "third");
		

	}
	//overload methods here
	public void print() {
		System.out.println("original print method.");
	}
	public void print(String str) {
		System.out.println(str);
	}
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
	/*cannot execute this method because compiler cannot differentiate
	the overloaded method below from the one above it
	*/
	/*public void print(String first, String second) {
		System.out.println(first + " " + second);
	}*/
}
