/**
 	func fib:

 	input: x - the position of the fibonacci number
 	output: the fibonacci number at position x

 	if ( x == 0 ) return 0
 	if ( x == 1 ) return 1

	return fibonacci(x-1) + fibonacci(x-2)
 */
public class Fib {
	public int fibonacci(int n) {
		if (n == 0) return 0;
		if (n==1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
