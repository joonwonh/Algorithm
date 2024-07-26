import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stackInt = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());

            if(input == 1)  {
                int inputStack = Integer.parseInt(st.nextToken());
                stackInt.push(inputStack);
            }
            else
                switch (input)  {
                    case 2 :
                        if (stackInt.isEmpty()) {
                            bw.write("-1\n");
                        }
                        else
                            bw.write(stackInt.pop()+"\n");
                        break;
                    case 3 :
                        bw.write(stackInt.size()+"\n");
                        break;
                    case 4 :
                        if (stackInt.isEmpty()) {
                            bw.write("1\n");
                        }
                        else
                            bw.write("0\n");
                        break;
                    case 5 :
                        if (stackInt.isEmpty()) {
                            bw.write("-1\n");
                        }
                        else
                            bw.write(stackInt.peek()+"\n");
                        break;
                }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}