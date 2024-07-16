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

        Map<Integer, Integer> arr1 = new HashMap<>();
        Map<Integer, Integer> arr2 = new HashMap<>();
        int [] comp1 = new int[N];
        int [] comp2 = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            arr1.put(key, 0);
            comp1[i] = key;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            arr2.put(key, 0);
            comp2[i] = key;
        }

        int count1 = 0;
        for (int i = 0; i < M; i++) {
            if(arr1.containsKey(comp2[i]))  {
                count1++;
            }
        }

        int count2 = 0;
        for (int i = 0; i < N; i++) {
            if(arr2.containsKey(comp1[i]))  {
                count2++;
            }
        }
        int result = (N-count1) + (M-count2);
        System.out.println(result);
    }
}