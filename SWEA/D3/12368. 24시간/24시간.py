
T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    A, B = map(int,input().split())
    time = A + B
    ans = 0
    if time % 24 != 0 :
        ans = time - ((time // 24) * 24)
    print(f"#{test_case} {ans}")