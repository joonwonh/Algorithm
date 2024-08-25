import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(fibonacci(Integer.parseInt(br.readLine())));
    }
    public static long fibonacci(int n)   {
        if (n == 0)	return 0;
        if (n == 1)	return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}