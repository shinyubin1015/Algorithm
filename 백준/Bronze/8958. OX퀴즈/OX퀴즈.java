import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str;
		
		for (int i = 0; i < n; i++) {
			str = sc.next();
			int sum = 0;
			int combo = 0;
			for (int j = 0; j < str.length(); j++) {
				if ( str.charAt(j) == 'O') {
					combo ++;
					sum += combo;
				} else {
					combo = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
