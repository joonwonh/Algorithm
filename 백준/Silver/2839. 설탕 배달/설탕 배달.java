
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sugar = 0;

        while(N>0)  {
            if(N%5 == 0)    {
                sugar += N/5;
                break;
            }
            else    {
                N-=3;
                sugar++;
            }
            if (N<0)    {
                sugar = -1;
            }
        }
        System.out.println(sugar);
    }
}