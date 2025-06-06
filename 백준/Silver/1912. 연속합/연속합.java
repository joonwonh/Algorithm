import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
		}
        int [] dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.max(arr[i] + dp[i-1], arr[i]);
		}
        
        int result = dp[0];
        
        for (int i = 0; i < dp.length; i++) {
			result = Math.max(dp[i], result);
		}
        System.out.println(result);
    }
}