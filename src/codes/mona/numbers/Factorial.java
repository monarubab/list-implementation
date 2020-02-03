package codes.mona.numbers;

// f(0) = 1
// f(n) = n * f(n-1)
public class Factorial {
	
	public int getFactorial(int number) {
		
		if(number < 0) {
			throw new IllegalArgumentException();
		}
		
		if(number == 0) {
			return 1;
		}
		
		return number * getFactorial(number-1);
	}
}
