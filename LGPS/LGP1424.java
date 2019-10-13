import java.util.Scanner;

public class LGP1424 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			int distance = 0;
			for (int i = x; i < n + x; i++) {
				if (i % 7 == 0 || i % 7 == 6)
					continue;
				distance += 250;

			}
			System.out.println(distance);
		}
	}

}
