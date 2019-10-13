import java.util.Scanner;

public class LGP1422 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double elec = sc.nextInt();
			if (elec <= 150)
				System.out.println(String.format("%.1f", elec * 0.4463));
			else if (elec <= 400)
				System.out.println(String.format("%.1f", 150 * 0.4463 + (elec - 150) * 0.4663));
			else
				System.out.println(String.format("%.1f", 150 * 0.4463 + (400 - 150) * 0.4663 + (elec - 400) * 0.5663));
		}
	}

}
