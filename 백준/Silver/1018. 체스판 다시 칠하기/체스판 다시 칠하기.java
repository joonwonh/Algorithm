import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                result = Math.min(result, chess(board, i, j));
            }
        }
        System.out.println(result);
    }

    public static int chess(char[][] board, int x, int y) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char whiteBoard = ((i + j) % 2 == 0) ? 'W' : 'B';
                char blackBoard = ((i + j) % 2 == 0) ? 'B' : 'W';

                if (board[x + i][y + j] != whiteBoard) {
                    count1++;
                }
                if (board[x + i][y + j] != blackBoard) {
                    count2++;
                }
            }
        }
        return Math.min(count1, count2);
    }
}