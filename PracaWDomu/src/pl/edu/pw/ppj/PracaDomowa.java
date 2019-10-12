package pl.edu.pw.ppj;

public class PracaDomowa {
	public static void main(String[] args) {
		PracaWDomuApp pwd = new PracaWDomuApp();
		int tab[][] = pwd.wypelnijTabele(4 +1);
		pwd.pokazTabele(tab);
	}
}
