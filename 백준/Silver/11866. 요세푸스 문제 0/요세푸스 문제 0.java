import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            q.offer(i+1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K-1; j++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        for (int i = 0; i < 2; i++) {
            sb.delete(sb.length()-1, sb.length());
        }
        sb.append(">");

        System.out.println(sb);
    }
}