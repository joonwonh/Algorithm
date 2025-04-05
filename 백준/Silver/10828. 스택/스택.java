import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        while(N != 0)   {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch(command)   {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    s.push(num);
                    N--;
                    break;
                case "pop" :
                    if(s.isEmpty()) {
                        System.out.println(-1);
                    }
                    else
                        System.out.println(s.pop());
                    N--;
                    break;
                case "size" :
                    System.out.println(s.size());
                    N--;
                    break;
                case "empty" :
                    if(s.isEmpty()) {
                        System.out.println(1);
                    }
                    else
                        System.out.println(0);
                    N--;
                    break;
                case "top" :
                    if(s.isEmpty()) {
                        System.out.println(-1);
                    }
                    else
                        System.out.println(s.peek());
                    N--;
                    break;
            }
        }
    }
}