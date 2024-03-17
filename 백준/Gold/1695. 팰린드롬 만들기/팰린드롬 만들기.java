import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int arr[];
    static int dp[][];

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n][n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n - 1; i >= 0 ; i--) {
            for (int j = 0; j <= n - 1; j++) {
                if(i >= j){
                    dp[i][j] = 0;
                    continue;
                }
                if(arr[i] != arr[j]){
                    dp[i][j] = Math.min(dp[i + 1][j] + 1, dp[i][j - 1] + 1);
                }else{
                    dp[i][j] += dp[i + 1][j - 1];
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }

}
