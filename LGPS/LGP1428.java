import java.util.Scanner;

public class LGP1428 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] fishes = new int[sc.nextInt()];
			for (int i = 0; i < fishes.length; i++) {
				fishes[i] = sc.nextInt();
				int pNum = 0;
				for (int j = 0; j < i; j++)
					if (fishes[i] > fishes[j])
						pNum++;
				System.out.print(pNum);
				if (i != fishes.length - 1)
					System.out.print(' ');
			}
		}
	}

}
