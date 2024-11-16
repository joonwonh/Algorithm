import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = findWordSpaces(arr, N, K);
            System.out.println("#" + t + " " + result);
        }
    }

    private static int findWordSpaces(int[][] arr, int N, int K) {
        int result = 0;

        for (int i = 0; i < N; i++) {
            int wordCount = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    wordCount++;
                } else {
                    if (wordCount == K) result++;
                    wordCount = 0;
                }
            }
            if (wordCount == K) result++;
        }
        for (int j = 0; j < N; j++) {
            int wordCount = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i][j] == 1) {
                    wordCount++;
                } else {
                    if (wordCount == K) result++;
                    wordCount = 0;
                }
            }
            if (wordCount == K) result++;
        }

        return result;
    }
}
