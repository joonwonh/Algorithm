import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int zero = 0;
        int one = 0;
        char preNum = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            char curNum = S.charAt(i);
            if(preNum != curNum)    {
                preNum = curNum;
                if(preNum == '1')   {
                    zero++;
                }
                else {
                    one++;
                }
            }

        }
        if(preNum == '1')   {
            one++;
        }
        else {
            zero++;
        }
        System.out.println(Math.min(one, zero));
    }
}