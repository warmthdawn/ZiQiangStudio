import java.util.Scanner;

public class LGP1085 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int maxTime=0;
			int maxDay=0;
			for (int i = 0; i < 7; i++) {
				int school = sc.nextInt();
				int home = sc.nextInt();
				if(maxTime < school+home) {
					maxTime = school+home;
					maxDay=i+1;
				}
			}
			System.out.println(maxDay);
		}
	}

}
