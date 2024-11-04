import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] leng = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            leng[i] = Integer.parseInt(st.nextToken());
        }
        int [] price = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        Long minPrice = 0L;

        for (int i = 0; i < price.length-1; i++) {
            if(price[i]<price[i+1]) {
                price[i+1] = price[i];
            }
        }
        for (int i = 0; i < leng.length; i++) {
            minPrice += price[i]*leng[i];
        }
        System.out.println(minPrice);
    }
}