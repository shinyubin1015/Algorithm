import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		String str1 = sc.nextLine();
		for (int i = 0; i < tc; i++) {
			str1 = sc.nextLine();
			String[] arr = str1.split(" ");
			for (int j = 0; j < arr.length; j++) {
				StringBuilder sb = new StringBuilder(arr[j]);
				System.out.print(sb.reverse() + " ");
			}
			System.out.println();
		}
	}

}
