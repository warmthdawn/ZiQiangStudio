import java.util.Scanner;

public class LGP1089 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int leftMoney = 0;
			int deposit = 0;
			for (int i = 1; i <= 12; i++) {
				leftMoney += 300;
				int monthUse = sc.nextInt();
				leftMoney -= monthUse;
				if (leftMoney < 0) {
					System.out.println(0 - i);
					return;
				}

				while (leftMoney >= 100) {
					leftMoney -= 100;
					deposit += 100;
				}

			}
			System.out.println((int) (leftMoney + deposit * 1.2));
		}
	}

}
