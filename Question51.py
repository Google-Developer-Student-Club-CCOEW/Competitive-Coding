if __name__ == "__main__":
    n = int(input())
    for i in range(n):
        i,j = list(map(int, input().split()))
        maxi = max(i,j)
        mini = min(i, j)
        count = 0
        while(True):
            if(maxi == mini):
                break
            else:
                maxi = maxi//2
                count +=1
                if(maxi != max(maxi, mini)):
                    maxi,mini = mini,maxi
        print(count)