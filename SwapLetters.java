package big0;

public class SwapLetters {
	public static void main(String[] args) {
		String s1 = "baaaaa";
		String s2 = "baaabbaabbba";
		String s3 = "baabab";

		System.out.println(findMininumMoves(s1));
		System.out.println(findMininumMoves(s2));
		System.out.println(findMininumMoves(s3));
	}

	public static int findMininumMoves(String s) {
		int count = 0;
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i += 2;
			}
		}

		return count;
	}

}
