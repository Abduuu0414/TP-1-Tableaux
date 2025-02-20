package ma.tp.arrays;

public class Ex2 {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 2, 3, 5, 7 };
		int targetSum = 7;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == targetSum) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}
	}
}
