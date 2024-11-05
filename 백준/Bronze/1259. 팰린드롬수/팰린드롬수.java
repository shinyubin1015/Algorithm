import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( true ) {
			String N = sc.nextLine();
			int O = 0;
			if (N.equals("0")) {
				break;
			}
			for (int i = 0; i < N.length(); i++) {
				int ch1 = N.length() - (N.length()-i);
				int ch2 = N.length() - i - 1;
				if (N.charAt(ch1) == N.charAt(ch2)) {
					O++;
				}
			}
			if ( O == N.length()) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}

