def min_operations(N, K, S):
    goodness = sum(S[i] != S[-i-1] for i in range(N//2))
    return abs(K - goodness)

num_cases = int(input())

for case in range(1, num_cases + 1):
    N, K = map(int, input().split())
    S = input().strip()
    y = min_operations(N, K, S)
    print('Case #{}: {}'.format(case, y))