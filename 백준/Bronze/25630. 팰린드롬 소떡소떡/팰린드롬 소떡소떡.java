import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int O = 0;
		String N = sc.next();
		for (int i = 0; i < tc; i++) {
			int ch1 = i;
			int ch2 = tc - 1 - i;
			if (N.charAt(ch1) != N.charAt(ch2)) {
				O++;
			}
		}
		System.out.println(O/2);
	}
}