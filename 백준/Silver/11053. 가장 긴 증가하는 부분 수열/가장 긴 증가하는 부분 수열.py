import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int,input().rstrip().split()))

dp = [0] * n
dp[0] = 1

for i in range(1, n):
    for j in range(i - 1, -1, -1):
        if arr[i] > arr[j]:
            dp[i] = max(dp[i], dp[j])
    dp[i] += 1

print(max(dp))