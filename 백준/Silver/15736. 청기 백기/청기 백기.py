'''
완전탐색 - 시간초과
청기가 위
약수의 개수만큼 뒤집음
제곱수는 약수의 개수가 홀수개 - 백기가 위
나머지는 짝수개 - 청기가 위
제곱수의 개수 구하는 문제
'''

n = int(input())
cnt = 0
for i in range(1, int(n ** 0.5) + 1):
    cnt += 1

print(cnt)