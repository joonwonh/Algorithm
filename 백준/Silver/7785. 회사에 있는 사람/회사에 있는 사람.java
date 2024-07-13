import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> memberSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if (state.equals("enter")) {
                memberSet.add(name);
            } else if (state.equals("leave")) {
                memberSet.remove(name);
            }
        }

        List<String> memberList = new ArrayList<>(memberSet);
        Collections.sort(memberList, Collections.reverseOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String name : memberList) {
            bw.write(name);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}