import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [] A = new int[N];
        int [] B = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++) {
        	A[i] = Integer.parseInt(st.nextToken());
		}
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B.length; i++) {
        	B[i] = Integer.parseInt(st.nextToken());
		}
        
        Arrays.sort(A);

        int result = 0;
        for (int i = 0; i < B.length; i++) {
        	int tmpArr = B[0];
        	int tmpNum = 0;
        	for (int j = 0; j < B.length; j++) {
    			if(tmpArr <= B[j])	{
    				tmpArr = B[j];
    				tmpNum = j;
    			}
			}
        	result += A[i]*tmpArr;
        	B[tmpNum] = 0;
		}
        System.out.println(result);
    }
}