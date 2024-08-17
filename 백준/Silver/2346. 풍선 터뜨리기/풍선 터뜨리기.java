import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> d1 = new ArrayDeque<>();
        Deque<Integer> d2 = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            d1.offer(i+1);
            d2.offer(Integer.parseInt(st.nextToken()));
        }
        StringBuilder sb = new StringBuilder();
        while(!d1.isEmpty()) {
            int tmp1 = d1.pollFirst();
            int tmp2 = d2.pollFirst();
            sb.append(tmp1).append(" ");

            if(d1.isEmpty())    {
                break;
            }
            
            if(tmp2 > 0)    {
                for (int i = 0; i < tmp2-1; i++) {
                    d1.offerLast(d1.pollFirst());
                    d2.offerLast(d2.pollFirst());
                }
            }
            else {
                for (int i = 0; i < Math.abs(tmp2); i++) {
                    d1.offerFirst(d1.pollLast());
                    d2.offerFirst(d2.pollLast());
                }
            }
        }
        System.out.println(sb);
    }
}