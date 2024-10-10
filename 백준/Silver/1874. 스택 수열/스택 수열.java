import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> s = new Stack<>();
        int num = 1;
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if(num <= arr[i])    {
                while(num <= arr[i]) {
                    s.push(num);
                    num++;
                    sb.append("+").append("\n");
                }
                s.pop();
                sb.append("-").append("\n");
            }
            else {
                if(s.pop() > arr[i])    {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    sb.append("-").append("\n");
                }
            }
        }
        if(result)  {
            System.out.println(sb);
        }
    }
}