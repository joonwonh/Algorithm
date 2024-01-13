import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int[] arr = new int[26];
		String word = sc.next();
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<word.length(); i++)	{
			int ascii = word.charAt(i);
			if(65<= ascii && ascii <=90)	{
				arr[ascii-65]++;
			}
			else if(97<= ascii && ascii<= 122)	{
				arr[ascii-97]++;
			}
		}
		
		for(int i=0; i<arr.length; i++)	{
			if(max < arr[i])	{
				max = arr[i];
				ch = (char)(i+65);
			}
			else if(max == arr[i])	{
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}