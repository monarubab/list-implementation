package codes.mona.numbers;

//f(0) = 0
//f(1) = 1
//f(n)=f(n-1) + f(n-2) for n > 1
public class Fibonacci {

	public int getFibonacci(int number) {
		
		if (number < 0) {
			throw new IllegalArgumentException();
		}

		if (number == 0) {
			return 0;
		}

		if (number == 1) {
			return 1;
		}

		return getFibonacci(number - 1) + getFibonacci(number - 2);
	}
}
