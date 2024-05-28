import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int n =0;
        int count =0;
        int sum = 0;

        while(sum<X)    {
            n = n+1;
            sum += n;
            count++;
        }
        sum = sum - n;  // sum에 n이 한번 더 더해지고 조건문을 확인한다음 탈출하니 n 한번 빼줘야 함

        if(count%2 == 0)    {
            System.out.println((X-sum) +"/"+ (count-(X-sum)+1));
        }
        else {
            System.out.println((count-(X-sum)+1) +"/"+ (X-sum));
        }
    }
}