import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 100;
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if ((a * n) >= m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
