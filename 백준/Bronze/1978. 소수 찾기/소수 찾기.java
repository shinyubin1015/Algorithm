import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		int count = N;
		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			if ( a == 1 ) {
				count--;
			}
			
			else {
				for(int j=2; j<a; j++) {
					if (a%j == 0) {
						count--;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}

}
