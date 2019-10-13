import java.util.Scanner;

public class LGP1046 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] apples = new int[10];
			for (int i = 0; i < apples.length; i++)
				apples[i] = sc.nextInt();
			int maxHeight = sc.nextInt();
			int n = 0;
			for (int i : apples) {
				if (i <= maxHeight + 30)
					n++;
			}
			System.out.println(n);
		}
	}
}
