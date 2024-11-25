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
			temp = arr[t];
			arr[t] = arr[c];
			arr[c] = temp;
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
