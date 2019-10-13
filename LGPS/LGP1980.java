import java.util.Scanner;

public class LGP1980 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int r = 0;
			for (int i = 0; i < n; i++) {
				String s = i + 1 + "";
				int index = -1;
				while ((index = s.indexOf((char) ('0' + x), index + 1)) >= 0) {
					r++;
				}
			}
			System.out.println(r);
		}
	}

}
