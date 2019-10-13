import java.util.Scanner;

public class LGP1567 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			String last = sc.next();
			String now;
			int upDays = 0;
			int maxUpDays = 0;
			for (int i = 1; i < N; i++) {
				now = sc.next();
				if (compareStr(now, last) > 0)
					upDays++;
				else
					upDays = 1;
				last = now;
				maxUpDays = Math.max(maxUpDays, upDays);
			}
			System.out.println(maxUpDays);
		}
	}

	static int compareStr(String a, String b) {
		return Integer.parseInt(a) - Integer.parseInt(b);
	}

}
