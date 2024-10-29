import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] bulb = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            bulb[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            switch (a)  {
                case 1:
                    firstCommand(bulb, b, c);
                    break;
                case 2:
                    secondCommand(bulb, b, c);
                    break;
                case 3:
                    thirdCommand(bulb, b, c);
                    break;
                case 4:
                    forthCommand(bulb, b, c);
                    break;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(bulb[i] + " ");
        }
    }
    private static void firstCommand(int[] bulb, int b, int c)  {
        bulb[b] = c;
    }

    private static void secondCommand(int[] bulb, int b, int c)  {
        for (int i = b; i <= c; i++) {
            if(bulb[i] == 0)    {
                bulb[i] = 1;
            }
            else {
                bulb[i] =0;
            }
        }
    }

    private static void thirdCommand(int[] bulb, int b, int c)  {
        for (int i = b; i <= c; i++) {
            bulb[i] =0;
        }
    }

    private static void forthCommand(int[] bulb, int b, int c)  {
        for (int i = b; i <= c; i++) {
            bulb[i] =1;
        }
    }
}