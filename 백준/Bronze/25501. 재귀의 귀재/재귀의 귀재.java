import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            count = 0;
            sb.append(isPalindrome(br.readLine())).append(" " + count);
            System.out.println(sb);
            sb.delete( 0, sb.length());
        }
    }
    public static int recursion(String s, int l, int r)   {
        if (l >= r) {
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            return 0;
        }
        else
            count++;
            return recursion(s, l+1, r-1);

    }
    public static int isPalindrome(String s)    {
        count++;
        return recursion(s, 0, s.length()-1);

    }
}
