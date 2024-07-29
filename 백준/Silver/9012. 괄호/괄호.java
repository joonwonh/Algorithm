import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            sb.append(result(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }

    public static String result(String s)   {
        Stack<String> stackVps = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if(check == '(')    {
                stackVps.push("(");
            }
            else if(check == ')')   {
                if(stackVps.isEmpty())  {
                    return ("NO");
                }
                else
                    stackVps.pop();
            }
        }
        if(stackVps.isEmpty())  {
            return ("YES");
        }
        else
            return ("NO");
    }
}