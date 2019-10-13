import java.util.Scanner;

public class LGP1909 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int minMoney = 0;
			for (int i = 1; i <= 3; i++) {
				int c = sc.nextInt();
				int p = sc.nextInt();

				int nMoney = (n % c == 0 ? n / c : (n / c + 1)) * p;
				if (minMoney == 0 || nMoney < minMoney)
					minMoney = nMoney;
			}
			System.out.println(minMoney);
		}
	}

}
