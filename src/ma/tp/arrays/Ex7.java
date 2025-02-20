package ma.tp.arrays;

public class Ex7 {
	public static void main(String[] args) {
		int[][] arr = { { -2, 1 }, { -1, 2, 1 }, { 4, -1, 2 } };
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
		System.out.println(
				"La ligne avec le plus grande somme est la ligne " + (indicef + 1) + " avec une somme de " + sf);
	}
}
