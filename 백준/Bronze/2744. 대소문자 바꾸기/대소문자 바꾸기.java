import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	InputStreamReader rd = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(rd);
    	String str = br.readLine();
    	
    	for (int i = 0; i < str.length(); i++) {
			if ( Character.isUpperCase(str.charAt(i))) {
				System.out.print(Character.toLowerCase(str.charAt(i)));
			} else {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
		}
    }
}
