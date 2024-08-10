import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        int card = 1;

        for (int i = 0; i < N; i++) {
            deque.add(card);
            card++;
        }

        while (deque.size()>1)  {
            deque.removeFirst();
            int tmp = deque.pollFirst();
            deque.addLast(tmp);
        }
        System.out.println(deque.pollFirst());
    }
}