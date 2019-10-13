import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LGP2141 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] numArr = new int[n];
			for (int i = 0; i < n; i++)
				numArr[i] = sc.nextInt();
			Arrays.sort(numArr);
			Set<Integer> result = new HashSet<Integer>();
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int sum = numArr[i] + numArr[j];
					if (Arrays.binarySearch(numArr, sum) >= 0) {
						result.add(sum);
					}
				}
			}

			System.out.println(result.size());

		}
	}

}
