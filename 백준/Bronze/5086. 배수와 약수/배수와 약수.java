import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> math = new ArrayList<>();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0)    {
                break;
            }
            math.add(A);
            math.add(B);
        }
        for (int i = 0; i < math.size(); i+=2) {
            if(math.get((i+1))%math.get(i)==0)  {
                System.out.println("factor");
            }
            else if(math.get(i)%math.get((i+1))==0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }
        }
    }
}