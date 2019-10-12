package pl.edu.pw.ppj;
public class PracaWDomuApp {

	public int tabela[][];

	public int[][] wypelnijTabele(int parametr) {
		tabela = new int[parametr][];
		for (int i = 0; i <= parametr - 1; i++) {
			tabela[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				tabela[i][j] = j;
			}
		}
		return tabela;
	}

	public void pokazTabele(int tab[][]) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] != tab[i].length - 1 || tab[i].length - 1 == 0) {
					System.out.printf("%d, ", tab[i][j]);
				} else {
					System.out.printf("%d ", tab[i][j]);
				}
			}
			System.out.println();
		}
	}
}
