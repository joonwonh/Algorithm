import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long [] P = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        P[4] = 2;
        P[5] = 2;
        P[6] = 3;
        P[7] = 4;
        P[8] = 5;
        P[9] = 7;
        P[10] = 9;

        for (int i = 11; i < P.length; i++) {
            P[i] = -1;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(pado(Integer.parseInt(br.readLine())));
        }
    }

    private static long pado(int N) {
        if(P[N] == -1)  {
            P[N] = pado(N-2) + pado(N-3);
        }
        return P[N];
    }
}