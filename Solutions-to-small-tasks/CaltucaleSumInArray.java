public class CalculateSumInArray {
	public static int calculateSum(int[] numbers) {
		if (numbers.length == 0) {
			return 0;
		}
		var sum = 0;

		for (var i = 0; i < numbers.length; i++) {
			int currentElement = numbers[i];
			sum += currentElement;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] example1 = {1, 2, 3, 4}; 
		System.out.println(calculateSum(example1)); // should be 10
	}
}
