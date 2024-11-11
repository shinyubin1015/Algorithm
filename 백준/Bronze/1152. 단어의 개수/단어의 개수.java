import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ns = str.trim();
		if (ns.isEmpty()) {
			System.out.println("0");
		} else {
			System.out.println(ns.split(" ").length);
		}
	 }
}

