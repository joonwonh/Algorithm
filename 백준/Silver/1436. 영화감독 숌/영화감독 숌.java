import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = 0;
        int count = 0;

        while(count != N)   {
            num++;
            if (String.valueOf(num).contains("666"))    {
                count++;
            }
        }
        System.out.println(num);
    }
}