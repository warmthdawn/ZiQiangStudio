import java.util.Scanner;

public class LGP1035 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			double d = 0;

			int n;
			for (n = 0; k >= d; n++) {
				d += 1.0 / (n + 1);
			}
			System.out.println(n);
		}
	}
}
