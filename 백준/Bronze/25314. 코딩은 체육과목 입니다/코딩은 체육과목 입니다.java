import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if ( n % 4 == 0) {
			for (int i = 1; i <= n / 4; i++) {
				System.out.print("long" + " ");
			}
			System.out.println("int");
		}
	}

}
