package big0;

public class ChocolateFeast {
	public static void main(String[] args) {
		int n = 15;
		int c = 3;
		int m = 2;

		System.out.println("Overall, Bobby has eaten: " + theFeast(n, c, m));

	}

	public static int theFeast(int n, int c, int m) {
		int chocolates = n / c;
		int wrappers = chocolates;

		while (wrappers >= m) {
			int freeChocolates = wrappers / m;
			chocolates += freeChocolates;
			wrappers = wrappers % m + freeChocolates;

		}

		return chocolates;

	}

}
