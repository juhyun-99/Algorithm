import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Work{
	int time;
	int money;
	Work(int time, int money){
		this.time = time;
		this.money = money;
	}
}
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Work[] works = new Work[n + 1];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			works[i] = new Work(t, p);
		}
		int ans = 0;
		int[] dp = new int[n + 2];
		int tmp = 0;
		for (int i = 1; i <= n ; i++) {
			tmp = Math.max(tmp, dp[i]);
			if(i + works[i].time <= n + 1) {
				dp[i + works[i].time] = Math.max(works[i].money + tmp, dp[i + works[i].time]);
				ans = Math.max(dp[i + works[i].time], ans);
			}
			//System.out.println(Arrays.toString(dp));
		}
		System.out.println(ans);
	}	
}
