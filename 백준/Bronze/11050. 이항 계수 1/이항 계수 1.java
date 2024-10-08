import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result1 = 1;
        for (int i = 1; i <= N; i++) {
            result1 *= i;
        }
        int result2 = 1;
        for (int i = 1; i <= K; i++) {
            result2 *= i;
        }
        int result3 = 1;
        for (int i = 1; i <= N-K; i++) {
            result3 *= i;
        }
        System.out.println(result1/(result2*result3));

    }
}