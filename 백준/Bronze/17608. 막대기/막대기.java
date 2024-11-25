import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int[] n = new int[tc];
		int cnt = 0;
		int max = 0;
		for (int i = 0; i < tc; i++) {
			n[i] = sc.nextInt();
			}
		for (int j = (tc-1); j >= 0; j--) {
			if ( max < n[j]) {
				cnt++;
				max = n[j];
			}
		}
		System.out.println(cnt);
	}
}
