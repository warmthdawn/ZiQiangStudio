import java.util.Scanner;

public class LGP1432 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double totalDistance = sc.nextDouble();
			double distance = 0;
			double step = 2;
			int i;
			for (i = 0; distance < totalDistance; i++) {
				distance += step;
				step *= 0.98;
			}
			System.out.println(i);
		}
	}

}
