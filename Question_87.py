for i in range(int(input())):
    N,M,X = map(int,input().split())
    z1 = N*X
    z2 = X+1
    if z2>M:
        print(0)
    else:
        print(z1//z2)

#inputs
# 4
# 2 100 50
# 3 100 50
# 5 40 40
# 10 50 49

# Outputs
# 1
# 2
# 0
# 9
