import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int avr = 0;
        for (int i = 0; i < arr.length; i++) {
            avr+=arr[i];
        }
        System.out.println(avr/5);
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}