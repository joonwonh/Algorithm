import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int count = 0;
		int N = sc.nextInt();
		 
		for (int i = 0; i < N; i++) {
			if (checker() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
		 
	public static boolean checker() {

		boolean[] check = new boolean[26];
		int prev = 0;
		String word = sc.next();
				
		for(int i = 0; i < word.length(); i++) {
			int curr = word.charAt(i);
			if (prev != curr) {		
				if ( check[curr - 'a'] == false ) {
					check[curr - 'a'] = true;
					prev = curr; 
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}    
		return true;
	}
}
