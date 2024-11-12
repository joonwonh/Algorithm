import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String [] s = S.split("-");
        int answer = 0;
        for (int i = 0; i < s.length; i++) {
        	int temp = solution(s[i]);
        	if(i ==0)	{
        		answer = temp;
        	}
        	else
        		answer -= solution(s[i]);
		}
        System.out.println(answer);
    }
    private static int solution(String s)	{
    	String [] sp = s.split("[+]");
    	int solutionAnswer = 0;
    	for (int i = 0; i < sp.length; i++) {
			solutionAnswer += Integer.parseInt(sp[i]);
		}
    	return solutionAnswer;
    }
}