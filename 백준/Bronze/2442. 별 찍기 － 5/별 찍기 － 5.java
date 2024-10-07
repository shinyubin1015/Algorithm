import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = i; j < a; j++) {
				System.out.print(" ");
			}
			for (int b = 0; b < i*2-1 ; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
