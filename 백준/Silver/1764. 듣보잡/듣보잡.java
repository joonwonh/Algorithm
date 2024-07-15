import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> name = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String newName = br.readLine();
            name.put(newName, newName);
        }

        int count = 0;
        List<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String newName = br.readLine();
            if(name.containsKey(newName))   {
                arr.add(newName);
                count++;
            }
        }
        Collections.sort(arr);
        System.out.println(count);
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}