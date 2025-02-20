package ma.tp.arrays;

public class Ex1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };
		int unique = 0;

		for (int num : arr) {
			int count = 0;
			for (int otherNum : arr) {
				if (num == otherNum) {
					count++;
				}
			}
			if (count == 1) {
				unique = num;
				break;
			}
		}

		System.out.println("Le nombre unique est : " + unique);
	}
}