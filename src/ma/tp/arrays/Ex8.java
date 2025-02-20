package ma.tp.arrays;

public class Ex8 {
	public static void main(String[] args) {
		int[][] map = { { 1, 1, 0, 1 }, { 0, 1, 1, 0 }, { 1, 0, 1, 1 }, { 1, 1, 1, 2 } };

		int startX = 0, startY = 0; // Position de départ
		String[] path = new String[map.length * map[0].length]; // Tableau pour stocker le chemin
		int[] pathIndex = { 0 }; // Utilisation d'un tableau pour passer pathIndex par référence

		if (findPath(map, startX, startY, path, pathIndex)) {
			System.out.println("Il y a une solution.");
			System.out.print("- Chemin trouvé: ");
			for (int i = 0; i < pathIndex[0]; i++) {
				System.out.print(path[i] + (i < pathIndex[0] - 1 ? " -> " : ""));
			}
			System.out.println();
		} else {
			System.out.println("Il n'y a pas de solution.");
		}
	}

	public static boolean findPath(int[][] map, int x, int y, String[] path, int[] pathIndex) {
		// Vérifier les limites et les conditions de déplacement
		if (x < 0 || y < 0 || x >= map.length || y >= map[0].length || map[x][y] == 0 || map[x][y] == -1) {
			return false;
		}

		// Ajouter la position au chemin
		path[pathIndex[0]] = "(" + x + ", " + y + ")";
		pathIndex[0]++;

		// Si on atteint la destination (2), on a trouvé un chemin
		if (map[x][y] == 2) {
			return true;
		}

		// Marquer la position comme visitée
		map[x][y] = -1;

		// Essayer les directions (droite, bas, gauche, haut)
		if (findPath(map, x, y + 1, path, pathIndex) || findPath(map, x + 1, y, path, pathIndex)
				|| findPath(map, x, y - 1, path, pathIndex) || findPath(map, x - 1, y, path, pathIndex)) {
			return true;
		}

		// Backtracking : annuler la marque si aucun chemin n'est trouvé
		map[x][y] = 1;
		pathIndex[0]--; // Supprimer la dernière position du chemin
		return false;
	}
}
