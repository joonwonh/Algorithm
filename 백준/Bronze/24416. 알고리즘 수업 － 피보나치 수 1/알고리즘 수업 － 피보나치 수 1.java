import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static int countFib = 0;
	static int countDp = 0;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	fibonacci(n);
    	dp(n);
    	System.out.print(countFib + " " + countDp);
    }
    
    private static int fibonacci(int n)	{
    	
    	if(n == 1 || n== 2)	{
    		countFib++;
    		return 1;
    	}
    	else
    		return fibonacci(n-1) + fibonacci(n-2);
    }
    
    private static int dp(int n)	{
    	int [] dpArr = new int[n+1];
    	for (int i = 0; i < dpArr.length; i++) {
			dpArr[i] = -1;
		}
    	dpArr[0] = 1;
    	dpArr[1] = 1;
    	
    	for (int i = 2; i < n; i++) {
			dpArr[i] = dpArr[i-1] - dpArr[i-2];
			countDp++;
		}
    	return dpArr[n-1];
    }
}