import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());    // 낮에 올라가는 거리
        int B = Integer.parseInt(st.nextToken());    // 밤에 떨어지는 거리
        int V = Integer.parseInt(st.nextToken());    // 나무 막대 길이
        /*
         * 반복문 사용 불가
        int day =0;
        int snail =0;

        while(true)   {
            day++;
            snail += A;
            if(snail >= V)   {
                break;
            }
            else {
                snail -= B;
            }
        }
        System.out.println(day);
        */
        
        int day = (V-B) / (A-B);
        if((V-B) % (A-B) != 0)  {
            day++;
        }
        System.out.println(day);
    }
}