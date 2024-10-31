import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        String [][] JOI = new String[H][W];
        String [] arr = new String[H];
        for (int i = 0; i < H; i++) {
            arr[i] = br.readLine();

            for (int j = 0; j < W; j++) {
                JOI[i][j] = arr[i].substring(j,j+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < H; i++) {
            int count = -1;
            for (int j = 0; j < W; j++) {
                if(JOI[i][j].equals("c"))    {
                    if(count>-1)    {
                        count=0;
                    }
                    else {
                        count++;
                    }
                    sb.append(String.valueOf(count)).append(" ");
                }
                else if(count==-1) {
                    sb.append(String.valueOf(count)).append(" ");
                }
                else {
                    count++;
                    sb.append(String.valueOf(count)).append(" ");
                }
                if(j == W-1)    {
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}