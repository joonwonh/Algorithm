import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine());
        int count =0;
        
        while(n !=0)	{
            if(n>=500)	{
            	count += n/500;
            	n = n%500;
            }	
            else if (n>=100 && n<500) {
            	count += n/100;
            	n = n%100;
			}
            else if (n>=50 && n<100) {
            	count += n/50;
            	n = n%50;
			}
            else if (n>=10 && n<50) {
            	count += n/10;
            	n = n%10;
			}
            else if (n>=5 && n<10) {
            	count += n/5;
            	n = n%5;
			}
            else {
            	count += n/1;
            	n = n%1;				
			}
        }
        System.out.println(count);
    }
}