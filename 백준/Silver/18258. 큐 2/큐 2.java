import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();
        int back = -1;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")) {
                int push = Integer.parseInt(st.nextToken());
                q.add(push);
                back =push;
            }
            else if (command.equals("pop")) {
                if(q.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(q.poll()).append("\n");
                    if (q.isEmpty()) {
                        back = -1;
                    }
                }
            }
            else if (command.equals("size")) {
                sb.append(q.size()).append("\n");
            }
            else if (command.equals("empty")) {
                if(q.isEmpty()) {
                    sb.append(1).append("\n");
                } else
                    sb.append(0).append("\n");
            }
            else if (command.equals("front")) {
                if(q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else
                    sb.append(q.peek()).append("\n");
            }
            else if (command.equals("back")) {
                sb.append(back).append("\n");
            }
        }
        System.out.println(sb);
    }
}