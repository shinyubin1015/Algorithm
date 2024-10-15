import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] a = new int[26];
		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i) - 'a';
			a[ch]++;
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
