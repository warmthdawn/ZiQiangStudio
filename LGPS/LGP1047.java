import java.util.Scanner;

public class LGP1047 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean[] road = new boolean[sc.nextInt() + 1];
			for (int i = 0; i < road.length; i++)
				road[i] = true;
			int M = sc.nextInt();
			for (int i = 0; i < M; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				for (int j = start; j <= end; j++)
					road[j] = false;
			}
			int result = 0;
			for (int i = 0; i < road.length; i++) {
				if (road[i])
					result++;
			}
			System.out.println(result);
		}
	}

}
