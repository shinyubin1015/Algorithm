import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int a = scanner.nextInt();
			if (a < n2) {
				System.out.print(a + " ");
			}
		}
		
		
	}

}
