total_input=int(input())
for _ in range(total_input):
    t,x=map(int,input().split())
    a={t:[]}
    for i in range(1,t):
        a[i]=[i+1]
        print(i,i+1)
        x-=1
    last=3
    while x>0:
        for i in range(1,last):
            
            if a[i][-1]<last:
                a[i].append(last)
                print(i,last)
                x-=1
                if x==0:break

        last+=1
