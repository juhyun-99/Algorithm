T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    dp = [0] * (N + 3)
    dp[1] = 1; dp[2] = 1; dp[3] = 1
    for i in range(4, N+1):
        dp[i] = dp[i-2] + dp[i-3]

    print(f'#{tc} {dp[N]}')