package ma.tp.arrays;

public class Ex3 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 3, 7, 6, 4 };
		int nbrP = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				int temp = arr[nbrP];
				arr[nbrP] = arr[i];
				arr[i] = temp;
				nbrP++;
			}
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}