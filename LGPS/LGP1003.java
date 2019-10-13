import java.util.Scanner;

public class LGP1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		int hour = c - a;
		int minute = d - b;

		if (minute < 0) {
			hour--;
			minute += 60;
		}

		String s = String.format("%d %d", hour, minute);
		System.out.println(s);

	}

}
