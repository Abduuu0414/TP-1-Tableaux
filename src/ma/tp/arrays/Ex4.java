package ma.tp.arrays;

import java.util.Arrays;

public class Ex4 {
	public static void main(String[] args) {
		int[][] arr = { { -2, 1, -3, 4 }, { -1, 2, 1, -5 }, { 4, -1, 2, 1 } };
		int sf = 0;
		int indicef = 0;
		for (int i = 0; i < arr.length; i++) {
			int s = 0;
			for (int j = 0; j < arr[i].length; j++) {
				s += arr[i][j];
			}
			if (sf <= s) {
				sf = s;
				indicef = i;
			}
		}
		System.out.println("Sous-tableau maximal " + Arrays.toString(arr[indicef]) + ", Somme = " + sf);
	}
}
