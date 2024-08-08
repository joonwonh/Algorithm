import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 1;
        int loop = 0;
        Stack<Integer> stack = new Stack<>();

        while (loop < N || !stack.isEmpty()) {
            if(loop< N)    {
                if(arr[loop] == count) {
                    arr[loop] = 0;
                    count++;
                }
                else {
                    if(!stack.isEmpty() && stack.peek() == count) {
                        stack.pop();
                        count++;
                        continue;
                    }
                    else {
                            stack.push(arr[loop]);
                            arr[loop] = 0;
                        }
                }
                loop++;
            }
            else {
                if(!stack.isEmpty() && stack.peek() == count)    {
                    stack.pop();
                    count++;
                }
                else {
                    break;
                }
            }
            
        }
        if(stack.isEmpty())    {
            System.out.println("Nice");
        }
        else {
            System.out.println("Sad");
        }
    }
}