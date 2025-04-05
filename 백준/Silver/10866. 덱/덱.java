import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> d = new ArrayDeque<>();
        while(N != 0)   {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch(command)   {
                case "push_front" :
                    d.offerFirst(Integer.parseInt(st.nextToken()));
                    N--;
                    break;
                case "push_back" :
                    d.offerLast(Integer.parseInt(st.nextToken()));
                    N--;
                    break;
                case "pop_front" :
                    if(d.isEmpty()) {
                        System.out.println(-1);
                    }
                    else
                        System.out.println(d.pollFirst());
                    N--;
                    break;
                case "pop_back" :
                    if(d.isEmpty()) {
                        System.out.println(-1);
                    }
                    else
                        System.out.println(d.pollLast());
                    N--;
                    break;
                case "size" :
                    System.out.println(d.size());
                    N--;
                    break;
                case "empty" :
                    if(d.isEmpty()) {
                        System.out.println(1);
                    }
                    else
                        System.out.println(0);
                    N--;
                    break;
                case "front" :
                    if(d.isEmpty()) {
                        System.out.println(-1);
                    }
                    else
                        System.out.println(d.peekFirst());
                    N--;
                    break;
                case "back" :
                    if(d.isEmpty()) {
                        System.out.println(-1);
                    }
                    else
                        System.out.println(d.peekLast());
                    N--;
                    break;
            }
        }
    }
}