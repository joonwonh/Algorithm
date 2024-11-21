import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][]dp = new int [30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(bridge(M,N)).append("\n");
        }
        System.out.println(sb);
    }
    private static int bridge(int M, int N) {
        if(dp[M][N] >0) {
            return dp[M][N];
        }
        if(M==N || N == 0)  {
            return dp[M][N] = 1;
        }

        return dp[M][N] = bridge(M-1,N-1) + bridge(M-1, N);
    }
}