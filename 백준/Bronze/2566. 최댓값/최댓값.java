import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A [] []	= new int [9][9];
		
		for(int i=0; i<9; i++)	{
			for(int j=0; j<9; j++)	{
				A[i][j] = sc.nextInt();
			}
		}
		
		int tmp =-1;
		int row = 0;
		int col = 0;
		
		for(int i=0; i<9; i++)	{
			for(int j=0; j<9; j++)	{
				if(A[i][j]>tmp)	{
					tmp = A[i][j];
					row = i+1;
					col = j+1;
				}
			}
		}
		System.out.println(tmp);
		System.out.println(row + " " + col);

	}
}