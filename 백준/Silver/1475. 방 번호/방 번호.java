import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] count = new int[10];

        for (int i = 0; i < N.length(); i++) {
            int num = N.charAt(i) - '0';
            count[num]++;
        }

        int sixNine = count[6] + count[9];
        count[6] = (sixNine + 1) / 2;
        count[9] = 0;

        int max = 0;
        for (int i = 0; i < 9; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        System.out.println(max);
    }
}