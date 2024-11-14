import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int [][] arr;
	static Integer [][] dp;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new int [n][500];
        dp = new Integer [n][500];
        arr[0][0] = Integer.parseInt(br.readLine());
        for (int i = 1; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j = 0; j <= i; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
        dp[0][0] = arr[0][0];
        
		for(int i = 0 ; i < n; i++)	{
			tri(n-1,i);
		}
		
		int max_value = 0;
		for(int i = 0 ; i < n; i++)	{
			max_value = Math.max(max_value, dp[n-1][i]);
		}
		
		System.out.println(max_value);
        
    }
    private static int tri(int row, int col)	{
		if(dp[row][col] == null) {
			if(col==0) {
				dp[row][col] = tri(row-1,col) + arr[row][col];
			}
			else if(row==col) {
				dp[row][col] = tri(row-1,col-1) + arr[row][col];
			}	
			else
				dp[row][col] = Math.max(tri(row-1,col), tri(row-1,col-1)) + arr[row][col];
		}
		
		return dp[row][col];
    }
}