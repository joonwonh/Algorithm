import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> d = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command1 = Integer.parseInt(st.nextToken());

            switch (command1) {
                case 1:
                    int command2 = Integer.parseInt(st.nextToken());
                    d.offerFirst(command2);
                    break;
                case 2:
                    int command3 = Integer.parseInt(st.nextToken());
                    d.offerLast(command3);
                    break;
                case 3:
                    if (!d.isEmpty()) {
                        sb.append(d.pollFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 4:
                    if (!d.isEmpty()) {
                        sb.append(d.pollLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 5:
                    sb.append(d.size()).append("\n");
                    break;
                case 6:
                    if (d.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 7:
                    if (!d.isEmpty()) {
                        sb.append(d.getFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 8:
                    if (!d.isEmpty()) {
                        sb.append(d.getLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}