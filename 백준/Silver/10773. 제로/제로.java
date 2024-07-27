import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stackInt = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0)  {
                stackInt.pop();
            }
            else
                stackInt.push(input);
        }

        int result = 0;
        for (int i = 0; i < stackInt.size(); i++) {
            result += stackInt.get(i);
        }

        System.out.println(result);
    }
}