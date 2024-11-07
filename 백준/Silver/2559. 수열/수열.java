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

        int [] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int [] arrSum = new int[N];
        arrSum[0] = arr[0];

        for (int i = 1; i < arrSum.length; i++) {
            arrSum[i] = arr[i] + arrSum[i-1];
        }

        int result = arrSum[K - 1];
        int tmp = 0;

        for (int i = 0; i < N-K; i++) {
            tmp = arrSum[i+K] - arrSum[i];
            if(tmp>result)  {
                result = tmp;
            }
        }
        System.out.println(result);
    }
}