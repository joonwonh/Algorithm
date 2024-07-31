import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String input = br.readLine();
            if(input.equals("."))   {
                break;
            }

            sb.append(result(input)).append("\n");
        }
        System.out.println(sb);
    }
    public static String result(String s)   {
        Stack<Character> stackBool = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if(check == '(' || check == '[')    {
                stackBool.push(check);
            }
            else if(check == ')')   {
                if(stackBool.isEmpty() || stackBool.peek() != '(') {
                    return "no";
                }
                else
                    stackBool.pop();
            }
            else if(check == ']')   {
                if(stackBool.isEmpty() || stackBool.peek() != '[') {
                    return "no";
                }
                else
                    stackBool.pop();
            }
        }
        if(stackBool.isEmpty())  {
            return "yes";
        }
        else
            return "no";
    }
}