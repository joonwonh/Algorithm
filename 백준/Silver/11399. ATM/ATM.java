import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int [] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            result[i] = sum;
        }
        int time = 0;
        for (int i = 0; i < result.length; i++) {
            time += result[i];
        }
        System.out.println(time);
    }
}