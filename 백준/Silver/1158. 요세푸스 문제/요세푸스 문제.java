import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            q.offer(i+1);
        }
        sb.append('<');
        while(q.size()>1)    {
            for (int i = 0; i < K-1; i++) {
                int tmp = q.poll();
                q.offer(tmp);
            }
            sb.append(q.poll()).append(',').append(' ');
        }
        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }
}