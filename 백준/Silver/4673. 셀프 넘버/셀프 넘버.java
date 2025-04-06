import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arr.add(i+1);
        }
        for (int i = 1; i <= 10000; i++) {
            int sol = selfNumber(i);
            int num = 0;
            while(num<arr.size()) {
                if(sol == arr.get(num)) {
                    arr.remove(num);
                    break;
                }
                num++;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
    public static int selfNumber(int n)   {
        int sum = n;
        while(n>0)  {
            sum += n%10;
            n /=10;
        }
        return sum;
    }
}