import java.util.ArrayList;
import java.util.Scanner;

public class LGP1427 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int number;
			ArrayList<Integer> list = new ArrayList<Integer>();
			while ((number = sc.nextInt()) != 0) {
				list.add(number);
			}

			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.print(list.get(i));
				if (i != 0)
					System.out.print(' ');
			}
		}
	}

}
