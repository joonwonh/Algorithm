import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int num1 = 1;
        int num2 = 1;
        Map<String, Integer> poketmonName = new HashMap<>();
        Map<Integer,String> poketmonNum = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            poketmonName.put(name,num1++);
            poketmonNum.put(num2++, name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String search = br.readLine();
            if(poketmonName.containsKey(search))    {
                Integer key = poketmonName.get(search);
                sb.append(key).append("\n");
            }
            else    {
                String key = poketmonNum.get(Integer.parseInt(search));
                sb.append(key).append("\n");
            }
        }
            System.out.println(sb);
    }
}