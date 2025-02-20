package ma.tp.arrays;

public class Ex6 {
	public static void main(String[] args) {
		int[][] arr = { { -2, 1, -3, 4 }, { -1, 2, 1, -5 }, { 4, -1, 2, 1 } };
		for (int i = 0; i < arr.length; i++) {
			int s = 0;
			for (int j = 0; j < arr[i].length; j++) {
				s += arr[i][j];
			}
			System.out.println("Somme de la ligne " + (i + 1) + " : " + s);
		}
	}
}
