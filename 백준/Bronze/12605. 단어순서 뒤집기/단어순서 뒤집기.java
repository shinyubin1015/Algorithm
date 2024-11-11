import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcc = sc.nextInt();
		String str = sc.nextLine();
		for (int i = 1; i <= tcc; i++) {
			str = sc.nextLine();
			String[] st = str.split(" ");
			System.out.print("Case #" + i + ": ");
			for (int j = st.length-1; j >= 0; j--) {
				System.out.print(st[j] + " ");
			}
			System.out.println();
		}
	}

}