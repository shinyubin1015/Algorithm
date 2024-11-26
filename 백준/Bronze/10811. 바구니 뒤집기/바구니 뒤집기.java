import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int tc = sc.nextInt();
		int[] arr = new int[n+1];
		int t, c;
		int temp;
		
		for (int i = 1; i <= n ; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < tc; i++) {
			t = sc.nextInt();
			c = sc.nextInt();
			for (int j = 0; j <= (c-t)/2; j++) {
				temp = arr[t+j];
				arr[t+j] = arr[c-j];
				arr[c-j] = temp;
			}
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
