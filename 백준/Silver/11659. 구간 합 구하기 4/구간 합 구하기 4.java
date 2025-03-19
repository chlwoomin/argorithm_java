
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()),m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int l = 0; l < n; l++) {
            arr.add(Integer.valueOf(st.nextToken()));
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int l = 1; l < n+1; l++) {
            dp[l] = dp[l-1] + arr.get(l-1);
        }
        for (int l = 0; l < m; l++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()), j = Integer.parseInt(st.nextToken());
            System.out.println(dp[j]-dp[i-1]);
        }
    }
}
