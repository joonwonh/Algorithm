import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int [][] arr;
	static int [][] dp;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int [N][3];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());	// red
			arr[i][1] = Integer.parseInt(st.nextToken());	// green
			arr[i][2] = Integer.parseInt(st.nextToken());	// blue
		}
        dp = new int[N][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];
        
        int result = 0;
        result = Math.min(RGB(N-1, 0), Math.min(RGB(N-1, 1), RGB(N-1, 2)));
        System.out.println(result);
    }
    private static int RGB(int N, int color)	{
    	if(dp[N][color] == 0)	{
    		if (color == 0) {
    			dp[N][color] = Math.min(RGB(N-1, 1), RGB(N-1, 2)) + arr[N][color];
			}
    		else if (color == 1) {
    			dp[N][color] = Math.min(RGB(N-1, 0), RGB(N-1, 2)) + arr[N][color];
			}
    		else if (color == 2) {
    			dp[N][color] = Math.min(RGB(N-1, 0), RGB(N-1, 1)) + arr[N][color];
			}
    	}
    	return dp[N][color];
    }
}