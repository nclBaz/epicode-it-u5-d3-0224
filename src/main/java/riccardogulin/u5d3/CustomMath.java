package riccardogulin.u5d3;

public class CustomMath {
	public static int sum(int a, int b){
		return a + b;
	}

	public static int sum(int[] numbers){
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
