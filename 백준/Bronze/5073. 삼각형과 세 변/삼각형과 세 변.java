import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<int[]> rect = new ArrayList<>();
        while (true)    {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if(x == 0 && y == 0 && w ==0)   {
                break;
            }
            int [] arr = {x,y,w};
            Arrays.sort(arr);
            rect.add(arr);
        }

        for (int i = 0; i < rect.size(); i++) {
            int [] arr = rect.get(i);
            if(arr[2]>= (arr[0] + arr[1]))  {
                System.out.println("Invalid");
            }
            else if(arr[0] == arr[1] && arr[0] == arr[2])   {
                System.out.println("Equilateral");
            }
            else if(arr[0] != arr[1] && arr[0] != arr[2] && arr[1] != arr[2])   {
                System.out.println("Scalene");
            }
            else {
                System.out.println("Isosceles");
            }
        }
    }
}