t = int(input())
for i in range(t):
    n = int(input())
    l = list(map(int, input().split()))
    c = 0
    for j in l:
        s = 0
        k = 0
        for z in l:
            if z <= j:
                s += 1
            elif z > j:
                k += 1
        if s > k:
            c += 1
    print(c)