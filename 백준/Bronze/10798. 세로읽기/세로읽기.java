import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char [][] arr = new char [5][15];
		
		for(int i=0; i<5; i++)	{
			String word = sc.next();
			
			for(int j=0; j<word.length(); j++)	{
				arr[i][j] = word.charAt(j);
			}
		}
		
		for(int i=0; i<15; i++)	{
			for(int j=0; j<5; j++)	{
				if(arr[j][i] == ' ' || arr[j][i] == '\0')		{
					continue;
				}
				System.out.print(arr[j][i]);
			}
		}		
	}
}