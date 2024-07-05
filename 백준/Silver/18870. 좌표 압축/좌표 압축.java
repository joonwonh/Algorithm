import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];    // 정렬된 배열
        int [] arr2 = new int[N];   // 기본 값

        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i]))    {
                map.put(arr[i], count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++) {
            sb.append(map.get(arr2[i])).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}