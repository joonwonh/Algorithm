import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(true) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> arr = new ArrayList<>();
            int sum = 0;
            if(N == -1) {
                break;
            }
            for (int i = 1; i < N; i++) {
                if(N%i == 0)    {
                    sum +=i;
                    arr.add(i);
                }
            }
            if(N == sum)    {
                System.out.print(N + " = " + arr.get(0));
                for (int i = 1; i < arr.size(); i++) {
                    System.out.print( " + " + arr.get(i));
                }
            }
            else {
                System.out.print(N + " is NOT perfect.");
            }
            System.out.println();
        }
    }
}