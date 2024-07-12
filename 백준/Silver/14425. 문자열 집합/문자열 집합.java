import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int mapIndx = 0;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), ++mapIndx);
		}
		
		String [] arrM	= new String[M];
		
		for (int i = 0; i < arrM.length; i++) {
			arrM[i] = br.readLine();
		}

		int count = 0;
			for (int j = 0; j < arrM.length; j++) {
				if(map.containsKey(arrM[j]))	{
					count++;
				}
			}
			System.out.println(count);
	}

}