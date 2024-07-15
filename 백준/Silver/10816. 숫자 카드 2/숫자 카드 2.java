import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer>card = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            if(card.get(key) == null)   {
                card.put(key, 1);
            } else {
              card.put(key, card.get(key)+1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int card2 = Integer.parseInt(st.nextToken());
            if(card.containsKey(card2)) {
                sb.append(card.get(card2)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}