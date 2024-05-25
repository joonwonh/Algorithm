import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(C/Q + " ");
            C %= Q;
            sb.append(C/D + " ");
            C %= D;
            sb.append(C/N + " ");
            C %= N;
            sb.append(C/P + "\n");
        }
        System.out.println(sb);
    }
}