import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = 0;
		int count = 0;
		while ( i < str.length() ) {
			char ch = str.charAt(i);
			if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

}
