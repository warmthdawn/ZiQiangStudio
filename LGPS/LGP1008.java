import java.util.Arrays;

public class LGP1008 {

	public static void main(String[] args) {
		char[] fin = new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		for (int i = 560; i < 988; i++) {
			if (i % 3 != 0)
				continue;
			if (i / 3 < 100)
				continue;
			int a = i / 3;
			int b = i / 3 * 2;
			int c = i;
			char[] arr = ("" + a + b + c).toCharArray();
			Arrays.sort(arr);
			if (Arrays.equals(arr, fin))
				System.out.println(a + " " + b + " " + c);
		}
	}

}
