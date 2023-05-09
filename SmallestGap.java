package big0;

public class SmallestGap {
	public static void main(String[] args) {

		int[] arr = { 7, 1, 3, 4, 1, 7 };
		System.out.println(findSmallestGap(arr));
		System.out.println("O(n^2)");

	}

	public static int findSmallestGap(int[] array) {
		int gap = array.length;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] == array[j]) {
					int currentGap = j - i;
					if (currentGap < gap) {
						gap = currentGap;
					}

				}
		}

		return gap;
	}

}
